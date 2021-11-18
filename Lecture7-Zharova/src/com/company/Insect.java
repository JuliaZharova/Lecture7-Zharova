package com.company;

import java.util.ArrayList;

abstract class Insect implements InsectBle {
    int numberOfLegs;
    String color;
    ArrayList<String> food;

    Insect (int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
        this.food = new ArrayList<String>();
    }

    Insect (String color) {
        this.color = color;
        this.food = new ArrayList<String>();
    }

    Insect (int numberOfLegs, String color, ArrayList<String> food) {
        this.numberOfLegs = numberOfLegs;
        this.color = color;
        this.food = food;
    }

    abstract void Eat();
}
