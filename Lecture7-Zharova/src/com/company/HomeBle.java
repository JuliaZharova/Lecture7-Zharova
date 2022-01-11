package com.company;

public interface HomeBle {
    String home = null;

    default void HomeBle () {
        System.out.println("Место проживания неизвестно ;(");
    }

    void HomeBle(String home);

    void HomeBle(boolean ifHaveHome);
}
