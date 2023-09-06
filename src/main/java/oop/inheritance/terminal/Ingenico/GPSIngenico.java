package oop.inheritance.terminal.Ingenico;

import oop.inheritance.terminal.services.ICommunication;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.services.IngenicoGPS;

public class GPSIngenico implements ICommunication {
    IngenicoGPS gps = new IngenicoGPS();
    @Override
    public boolean open() {
        return gps.open();
    }

    @Override
    public boolean send(Object message) {
        return gps.send((Transaction) message);
    }

    @Override
    public Object receive() {
        return gps.receive();
    }

    @Override
    public void close() {
        gps.close();
    }
}
