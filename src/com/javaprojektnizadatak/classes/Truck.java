package com.javaprojektnizadatak.classes;

public class Truck extends Vehicle {
    public String vehicleSize;
    public String fuelType;
    public double chargeFee;
    public Truck() {
        vehicleSize = Size.BIG.toString();
        fuelType = Engine.GAS.toString();
        chargeFee = 90;
    }
}
