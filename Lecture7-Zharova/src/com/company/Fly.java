package com.company;

import java.util.ArrayList;

class Fly extends Winged {

    double flySpeed;

    Fly(int numberOfLegs, String color, int numberOfWings, ArrayList<String> food, double flySpeed) {
        super(numberOfLegs, color, numberOfWings, food);
        this.flySpeed = flySpeed;
    }

    @Override
    void Eat() {
        System.out.println("Мухи едят:" + food);
    }

    void GetSpeedInfo () {
        System.out.println("Мухи очень быстрые, они летают со скоростью " + flySpeed + " км/ч!");
    }
}