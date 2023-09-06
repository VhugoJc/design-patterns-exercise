package oop.inheritance.terminal;

import oop.inheritance.terminal.services.ICommunication;
import oop.inheritance.terminal.services.IDisplay;
import oop.inheritance.terminal.services.IKeyboard;
import oop.inheritance.terminal.services.IPrinter;

public interface ITerminal {
    IDisplay createDisplay();
    IKeyboard createKeyboard();
    IPrinter createPrinter();
    CardProvider createCardProvider();
    ICommunication createEthernet();
    ICommunication createModem();

}
