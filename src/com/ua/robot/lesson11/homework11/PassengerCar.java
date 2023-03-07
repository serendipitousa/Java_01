package com.ua.robot.lesson11.homework11;

public class PassengerCar extends Car {
    private int passengerCapacity;

    public PassengerCar(String model, String color, int year, int horsepower, String type, int passengerCapacity) {
        super(model, color, year, horsepower, type);
        this.passengerCapacity = passengerCapacity;

    }

    @Override
    public String showTypeCar() {
        return "Type of Passenger Car: " + super.getType();
    }
}
