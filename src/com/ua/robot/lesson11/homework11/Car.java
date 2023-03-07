package com.ua.robot.lesson11.homework11;

public class Car {
    private String model;
    private String color;
    private int year;
    private int horsepower;
    private String type;

    public String getType() {
        return type;
    }
    public String showTypeCar() {
        return "Car";
    }

    public Car(String model, String color, int year, int horsepower, String type) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.horsepower = horsepower;
        this.type = type;
    }
}
