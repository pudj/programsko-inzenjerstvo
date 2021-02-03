package com.javaprojektnizadatak.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberGenerator {

    public double randomNumber(double fuel) {
        double randomDouble;
        randomDouble = Math.random();
        return randomDouble;
    }

    public String toPercentage(double randomDouble) {
        String format = new DecimalFormat("%#0.0").format(randomDouble);
        return format;
    }

    public String toString(double doubleToString) {
        return String.valueOf(doubleToString);
    }
}
