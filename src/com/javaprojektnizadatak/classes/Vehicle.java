package com.javaprojektnizadatak.classes;

import com.javaprojektnizadatak.utils.NumberGenerator;

public class Vehicle {

    public enum Size {
        BIG,
        SMALL
    }

    public enum Engine{
        GAS,
        ELECTRIC
    }

    public double Fuel;

    NumberGenerator numberGenerator = new NumberGenerator();

    public Vehicle() {
       Fuel = numberGenerator.randomNumber(Fuel);
    }




}
