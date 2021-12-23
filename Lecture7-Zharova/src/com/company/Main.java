package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Winged myInsect = new Winged(4, "red", 4, new ArrayList<>(Arrays.asList("Мелкие насекомые", "Пыльца")));
        Bee ins0 = new Bee(3, "black", 6, new ArrayList<>(Arrays.asList("Мелкие насекомые", "Пыльца", "Жидкая пища")),2);
        Fly ins1 = new Fly(6, "yellow", 4, new ArrayList<>(Arrays.asList("Пыльца", "Жидкая пища")), 15);
        Dragonfly ins2 = new Dragonfly(5, "blue", 4, new ArrayList<>(Arrays.asList("Мелкие насекомые")), true );

        myInsect.Eat();
        myInsect.Eat("яблочко");
        myInsect.insectBle("pink");

        ins0.Eat();
        ins0.insectBle("yellow");
        ins0.HomeBle(true);

        ins1.GetSpeedInfo();
        ins1.Eat();
        ins1.HomeBle("твоей квартире");
        ins1.insectBle("black");

        ins2.Eat();
        ins2.Eat("ромашку");
        ins2.HomeBle();

        System.out.println("У всех насекомых только " + InsectBle.EYES + " глаза.");
    }
}