package com.sturc.Strategy;

import com.sturc.Strategy.Fly.FlyWithWings;
import com.sturc.Strategy.Quack.Quack;


public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard duck.");
    }
}
