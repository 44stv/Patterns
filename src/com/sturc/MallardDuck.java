package com.sturc;

import com.sturc.Fly.FlyWithWings;
import com.sturc.Quack.Quack;

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
