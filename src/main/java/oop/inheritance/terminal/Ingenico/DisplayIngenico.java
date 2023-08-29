package oop.inheritance.terminal.Ingenico;

import oop.inheritance.terminal.services.IDisplay;

public class DisplayIngenico implements IDisplay {
    oop.library.ingenico.services.IngenicoDisplay ingenicoDisplay = new oop.library.ingenico.services.IngenicoDisplay();
    @Override
    public void showMessage(int x, int y, String message) {
        ingenicoDisplay.showMessage(x, y, message);
    }

    @Override
    public void clear() {
        ingenicoDisplay.clear();
    }
}
