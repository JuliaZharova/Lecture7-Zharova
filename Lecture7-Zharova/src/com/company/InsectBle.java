package com.company;

import java.util.ArrayList;

public interface InsectBle {
    default void insectBle() {
        System.out.println("Данные не известны");
    }

    void insectBle (int numberOfLegs);

    void insectBle (String color);

    void insectBle (int numberOfLegs, String color, ArrayList<String> food);
}
