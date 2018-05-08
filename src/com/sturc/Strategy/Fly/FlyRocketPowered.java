package com.sturc.Strategy.Fly;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with a rocket.");
    }
}
