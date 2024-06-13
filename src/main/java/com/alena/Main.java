package com.alena;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human humanMax = new Human("Max");
        Human humanAlice = new Human("Alice");
        Human humanMark = new Human("Mark");
        Human humanKate = new Human("Kate");

        Market market = new Market();
        market.acceptToMarket(humanMax);

        market.releaseFromMarket(List.of(humanMax));

        market.acceptToMarket(humanAlice);
        market.takeInQueue(humanAlice);

        market.update();
        market.acceptToMarket(humanMark);
        market.acceptToMarket(humanKate);
        market.takeInQueue(humanKate);
        market.takeInQueue(humanMark);
        market.update();
        market.update();
        market.update();
        market.update();
        market.releaseFromMarket(List.of(humanAlice,humanKate));
        market.update();
        market.releaseFromMarket(List.of(humanMark));








    }
}