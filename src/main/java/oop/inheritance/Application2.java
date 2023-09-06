package oop.inheritance;
import oop.inheritance.terminal.CardProvider;
import oop.inheritance.terminal.Transaction;
import oop.inheritance.terminal.services.ICommunication;
import oop.inheritance.terminal.services.IDisplay;
import oop.inheritance.terminal.services.IKeyboard;
import oop.inheritance.terminal.ITerminal;
import oop.inheritance.terminal.services.IPrinter;
import oop.library.ingenico.model.Card;
import oop.library.ingenico.services.IngenicoPrinter;

import java.time.LocalDateTime;

public class Application2 {
    private final ITerminal supportedTerminal;
    private final ICommunication communicationTerminal;

    public Application2(ITerminal supportedTerminal, ICommunication communicationTerminal) {
        this.supportedTerminal = supportedTerminal;
        this.communicationTerminal = communicationTerminal;
    }

    public void showMenu() {
        IDisplay display = supportedTerminal.createDisplay();
        display.showMessage(5,5,"MENU");
        display.showMessage(5,10,"1.    VENTA");
        display.showMessage(5,13,"2.    DEVOLUCION");
        display.showMessage(5,16,"3.    REPORTE");
        display.showMessage(5,23,"4.    CONFIGURACION");
    }
    public String readKey(){
        IKeyboard keyboard = supportedTerminal.createKeyboard();
        return keyboard.getChar();
    }
    public void doSale() {
        IDisplay display = supportedTerminal.createDisplay();
        IKeyboard keyboard = supportedTerminal.createKeyboard();
        //read card
        CardProvider cardProvider = supportedTerminal.createCardProvider();
        cardProvider.readCard(card -> {
            display.clear();
            display.showMessage(5, 20, "Capture monto:");
            // transaction
            String amount = keyboard.readLine(); //Amount with decimal point as string
            Transaction transaction = new Transaction();
            transaction.setLocalDateTime(LocalDateTime.now());
            transaction.setCard(card);
            transaction.setAmountInCents(Integer.parseInt(amount.replace(".", "")));
            communicationTerminal.open();
            communicationTerminal.send(transaction);
            communicationTerminal.receive();
            communicationTerminal.close();
            printReceipt(transaction);
        });
    }

    public void clearScreen(){
        IDisplay display = supportedTerminal.createDisplay();
        display.clear();
    }

    private void printReceipt(Transaction transaction) {
        Object card = transaction.getCard();
        IPrinter printer = supportedTerminal.createPrinter();
        printer.print(5, "APROBADA");
        printer.lineFeed();
//        printer.print(5, card.getAccount());
        printer.lineFeed();
        printer.print(5, "" + transaction.getAmountInCents());
        printer.lineFeed();
        printer.print(5, "________________");
    }
}
