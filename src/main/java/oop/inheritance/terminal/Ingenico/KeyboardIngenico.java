package oop.inheritance.terminal.Ingenico;

import oop.inheritance.terminal.services.IKeyboard;
import oop.library.ingenico.services.IngenicoKeyboard;

public class KeyboardIngenico implements IKeyboard {
    IngenicoKeyboard ingenicoKeyboard = new IngenicoKeyboard();
    @Override
    public String getChar() {
        return ingenicoKeyboard.getChar();
    }

    @Override
    public String readLine() {
        return ingenicoKeyboard.readLine();
    }
}
