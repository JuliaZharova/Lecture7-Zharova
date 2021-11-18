package com.company;

import java.util.ArrayList;

class Dragonfly  extends Winged {

    boolean isBitePeople;

    Dragonfly(int numberOfLegs, String color, int numberOfWings, ArrayList<String> food, boolean isBitePeople) {
        super(numberOfLegs, color, numberOfWings, food);
        this.isBitePeople = isBitePeople;
    }

    @Override
    void Eat() {
        System.out.println("Стрекозы едят: " + food);
        System.out.println(isBitePeople
                ? "Стрекозы не кусают людей без причины, но если их разозлить, могут укусить до крови."
                : "Стрекозы не кусают людей, их не интересует человечина.");
    }
}