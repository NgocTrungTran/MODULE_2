package com.codegym;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
    public String getCarName() {
        return this.name;
    }
    public String getCarEngine() {
        return this.engine;
    }
}
