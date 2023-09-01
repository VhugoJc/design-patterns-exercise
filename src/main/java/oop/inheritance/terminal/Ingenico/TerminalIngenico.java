package oop.inheritance.terminal.Ingenico;

import oop.inheritance.terminal.CardProvider;
import oop.inheritance.terminal.services.IDisplay;
import oop.inheritance.terminal.services.IKeyboard;
import oop.inheritance.terminal.ITerminal;

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
    public CardProvider createCardProvider() {
        return new CardProviderIngenico();
    }
}
