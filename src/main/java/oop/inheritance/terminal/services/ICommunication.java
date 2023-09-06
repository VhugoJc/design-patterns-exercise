package oop.inheritance.terminal.services;

import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;

public interface ICommunication {
    boolean open();

    boolean send(Object message);

    Object receive();

    void close();
}
