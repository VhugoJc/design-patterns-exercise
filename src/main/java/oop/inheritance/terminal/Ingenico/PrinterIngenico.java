package oop.inheritance.terminal.Ingenico;

import oop.inheritance.terminal.services.IPrinter;
import oop.library.ingenico.services.IngenicoPrinter;

public class PrinterIngenico implements IPrinter {
    IngenicoPrinter ingenicoPrinter = new IngenicoPrinter();
    @Override
    public void print(int x, String message) {
        ingenicoPrinter.print(x,message);
    }

    @Override
    public void lineFeed() {
        ingenicoPrinter.lineFeed();
    }
}
