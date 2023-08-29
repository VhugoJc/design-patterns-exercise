package oop.inheritance;

import oop.inheritance.terminal.ITerminal;
import oop.inheritance.terminal.Ingenico.TerminalIngenico;

public class Main {

    public static void main(String[] args) {
        ITerminal terminal = new TerminalIngenico();

        Application2 app = new Application2(terminal);
//        while (true) {
//            run(application);
//        }
    }

    public static void run(Application application) {
        application.clearScreen();
        application.showMenu();

        String key = application.readKey();

        switch (key) {
            case "1":
                application.doSale();
                break;
            case "2":
                application.doRefund();
                break;
            case "3":
                application.printReport();
                break;
            case "4":
                application.showConfiguration();
                break;
        }
    }

}
