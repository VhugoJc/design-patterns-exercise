package oop.inheritance.terminal.Ingenico;

import oop.inheritance.terminal.CardProvider;
import oop.library.ingenico.model.Card;
import oop.library.ingenico.services.IngenicoCardSwipper;
import oop.library.ingenico.services.IngenicoChipReader;

import java.util.function.Consumer;

public class CardProviderIngenico implements CardProvider {
    @Override
    public void readCard(Consumer<Object> callBack) {
        IngenicoCardSwipper cardSwipper = new IngenicoCardSwipper();
        IngenicoChipReader chipReader = new IngenicoChipReader();
        Card card;
        do {
            card = cardSwipper.readCard();
            if (card == null) {
                card = chipReader.readCard();
            }
        } while (card == null);

        callBack.accept(card);
    }
}
