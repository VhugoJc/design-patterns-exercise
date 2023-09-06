package oop.inheritance.terminal.Ingenico;

import oop.inheritance.terminal.services.ICommunication;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.services.IngenicoModem;

public class ModemIngenico implements ICommunication {
    IngenicoModem modem = new IngenicoModem();
    @Override
    public boolean open() {
        return modem.open();
    }

    @Override
    public boolean send(Object message) {
        return modem.send((Transaction) message);
    }

    @Override
    public Object receive() {
        return modem.receive();
    }

    @Override
    public void close() {
        modem.close();
    }
}
