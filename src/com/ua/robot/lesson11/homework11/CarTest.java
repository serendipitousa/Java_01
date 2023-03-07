package com.ua.robot.lesson11.homework11;

public class CarTest {
    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("BMW", "Red", 2018, 200, "Passenger Car", 5);
        System.out.println(passengerCar.showTypeCar());
        TruckCar truckCar = new TruckCar("Mercedes", "White", 2018, 200, "Truck Car", 10000);
        System.out.println(truckCar.showTypeCar());

    }
}
