package oop.inheritance.terminal.Ingenico;

import oop.inheritance.terminal.CardProvider;
import oop.inheritance.terminal.services.ICommunication;
import oop.inheritance.terminal.services.IDisplay;
import oop.inheritance.terminal.services.IKeyboard;
import oop.inheritance.terminal.ITerminal;
import oop.inheritance.terminal.services.IPrinter;

public class TerminalIngenico implements ITerminal {
    @Override
    public IDisplay createDisplay() {
        return new DisplayIngenico();
    }

    @Override
    public IKeyboard createKeyboard() {
        return new KeyboardIngenico();
    }

    @Override
    public IPrinter createPrinter() {
        return new PrinterIngenico();
    }

    @Override
    public CardProvider createCardProvider() {
        return new CardProviderIngenico();
    }

    @Override
    public ICommunication createEthernet() {
        return new EthernetIngenico();
    }

    @Override
    public ICommunication createModem() {
        return new ModemIngenico();
    }
}
