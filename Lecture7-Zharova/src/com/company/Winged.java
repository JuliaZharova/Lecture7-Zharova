package com.company;

import java.util.ArrayList;

class Winged extends Insect implements HomeBle{

    int numberOfWings;

    Winged(int numberOfLegs, String color, int numberOfWings, ArrayList<String> food) {
        super(numberOfLegs, color, food);
        this.numberOfWings = numberOfWings;
    }

   void Eat() {
     System.out.println("Крылатые насекомые едят: " + food);
   }

    void Eat(String product) {
      System.out.println("Сейчас крылатое насекомое ест: " + product);
   }

    @Override
    public void insectBle(int numberOfLegs) {
        System.out.println("Количество ног " + numberOfLegs);
    }

    @Override
    public void insectBle(String color) {
        System.out.println("Его цвет " + color);
    }

    @Override
    public void insectBle(int numberOfLegs, String color, ArrayList<String> food) {
        System.out.println("Количество ног " + numberOfLegs + "Цвет " + color + "Список еды " + food);
    }


    @Override
    public void HomeBle(String home) {
        System.out.println("Они живут в " + home);
    }

    @Override
    public void HomeBle(boolean ifHaveHome) {
        System.out.println("У него есть дом: " + ifHaveHome);
    }
}