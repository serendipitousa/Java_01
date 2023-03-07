package com.ua.robot.lesson11.homework11;

public class TruckCar extends Car{
    private int weight;
    public TruckCar(String model, String color, int year, int horsepower, String type, int weight) {
        super(model, color, year, horsepower, type);
        this.weight = weight;
    }

    @Override
    public String showTypeCar() {
        return "Type of Truck Car: " + super.getType();
    }
}
