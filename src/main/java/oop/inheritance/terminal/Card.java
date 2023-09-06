package oop.inheritance.terminal;

public class Card {
    private final String account;
    private final Object expirationDate;
    private final Object entryMode;

    public Card(String account, Object expirationDate, Object entryMode) {
        this.account = account;
        this.expirationDate = expirationDate;
        this.entryMode = entryMode;
    }

    public String getAccount() {
        return account;
    }

    public Object getExpirationDate() {
        return expirationDate;
    }

    public Object getEntryMode() {
        return entryMode;
    }
}

