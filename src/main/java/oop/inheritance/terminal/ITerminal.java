package oop.inheritance.terminal;

import oop.inheritance.terminal.services.IDisplay;
import oop.inheritance.terminal.services.IKeyboard;

public interface ITerminal {
    IDisplay createDisplay();
    IKeyboard createKeyboard();
}
