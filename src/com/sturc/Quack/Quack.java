package com.sturc.Quack;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack.");
    }
}
