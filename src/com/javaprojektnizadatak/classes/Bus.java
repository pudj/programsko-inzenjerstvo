package com.javaprojektnizadatak.classes;

public class Bus extends Vehicle {
public String vehicleSize;
public String fuelType;
public double chargeFee;
    public Bus() {
     vehicleSize = Size.BIG.toString();
     fuelType = Engine.GAS.toString();
     chargeFee = 70;
    }
}


