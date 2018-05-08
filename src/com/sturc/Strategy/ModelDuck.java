package com.sturc.Strategy;

import com.sturc.Strategy.Fly.FlyNoWay;
import com.sturc.Strategy.Quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Model duck.");
    }
}
