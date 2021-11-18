package com.company;

import java.util.ArrayList;

class Bee extends Winged {

    int gramsOfHoney;

    Bee(int numberOfLegs, String color, int numberOfWings, ArrayList<String> food) {
        super(numberOfLegs, color, numberOfWings, food);
    }

    Bee(int numberOfLegs, String color, int numberOfWings, ArrayList<String> food, int gramsOfHoney) {
        super(numberOfLegs, color, numberOfWings, food);
        this.gramsOfHoney = gramsOfHoney;
    }

    @Override
    void Eat() {
        System.out.println("Пчелы едят: " + food);
        if(gramsOfHoney != 0){
            System.out.println("А еще, пчела может съесть " + gramsOfHoney + " грамм меда в день! О_О");
        }
    }
}