package oop.inheritance.terminal;

import java.util.function.Consumer;

public interface CardProvider {
    void readCard(Consumer<Object> callBack); //The Consumer interface's #accept# method serves as the callback's logic.


}
