package com.example.studyone.test;

public interface InterfaceEnum {

    enum Coffee implements InterfaceEnum {
        BLACK_COFFEE, DECAF_COFFEE, LATTE, CAPPUCCINO
    }

    enum Dessert implements InterfaceEnum {
        FRUIT, CAKE, GELATO
    }
}
