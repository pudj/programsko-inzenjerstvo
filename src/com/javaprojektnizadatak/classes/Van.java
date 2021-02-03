package com.javaprojektnizadatak.classes;

public class Van extends Vehicle {
    public String vehicleSize;
    public String fuelType;
    public double chargeFee;
    public Van() {
        vehicleSize = Size.BIG.toString();
        fuelType = Engine.GAS.toString();
        chargeFee = 80;
    }
}
