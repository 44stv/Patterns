package com.sturc;

import com.sturc.Fly.FlyNoWay;
import com.sturc.Quack.Quack;

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
