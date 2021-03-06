package com.sturc.Observer.Displays;

import com.sturc.Observer.DisplayElement;
import com.sturc.Observer.Observer;
import com.sturc.Observer.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + " C, " + humidity + " humidity, " + pressure + " pressure.");
    }
}
