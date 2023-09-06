package oop.inheritance.terminal;
import java.time.LocalDateTime;

public class Transaction {
    private int amountInCents;
    private Object card;
    private LocalDateTime localDateTime;

    public int getAmountInCents() {
        return amountInCents;
    }

    public void setAmountInCents(int amountInCents) {
        this.amountInCents = amountInCents;
    }

    public Object getCard() {
        return card;
    }

    public void setCard(Object card) {
        this.card = card;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
