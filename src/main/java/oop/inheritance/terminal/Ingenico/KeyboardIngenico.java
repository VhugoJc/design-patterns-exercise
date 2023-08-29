package oop.inheritance.terminal.Ingenico;

import oop.inheritance.terminal.services.IKeyboard;

public class KeyboardIngenico implements IKeyboard {
    oop.library.ingenico.services.IngenicoKeyboard ingenicoKeyboard = new oop.library.ingenico.services.IngenicoKeyboard();
    @Override
    public String getChar() {
        return ingenicoKeyboard.getChar();
    }

    @Override
    public String readLine() {
        return ingenicoKeyboard.readLine();
    }
}
