package oop.inheritance.terminal.Ingenico;

import oop.inheritance.terminal.services.ICommunication;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.services.IngenicoEthernet;

public class EthernetIngenico implements ICommunication {
    IngenicoEthernet ethernet = new IngenicoEthernet();
    @Override
    public boolean open() {
        return ethernet.open();
    }

    @Override
    public boolean send(Object message) {
        return ethernet.send((Transaction) message);
    }

    @Override
    public Object receive() {
        return ethernet.receive();
    }

    @Override
    public void close() {
        ethernet.close();
    }
}
