package oop.inheritance;
import oop.inheritance.terminal.CardProvider;
import oop.inheritance.terminal.services.IDisplay;
import oop.inheritance.terminal.services.IKeyboard;
import oop.inheritance.terminal.ITerminal;

public class Application2 {
    private final ITerminal supportedTerminal;

    public Application2(ITerminal supportedTerminal) {
        this.supportedTerminal = supportedTerminal;
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
        cardProvider.readCard(x -> {
        // transaction
        // print receipt
        });
    }

    public void clearScreen(){
        IDisplay display = supportedTerminal.createDisplay();
        display.clear();
    }
}
