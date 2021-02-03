package com.javaprojektnizadatak.classes;

public class Car extends Vehicle {
    public String vehicleSize;
    public String fuelType;
    public double chargeFee;

    public Car() {
        vehicleSize = Size.BIG.toString();
        fuelType = Engine.GAS.toString();
        chargeFee = 50;
    }

}
