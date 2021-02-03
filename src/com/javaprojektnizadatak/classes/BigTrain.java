package com.javaprojektnizadatak.classes;

import com.javaprojektnizadatak.interfaces.TrainLoader;

import java.util.ArrayList;

public class BigTrain implements TrainLoader {

    public ArrayList<Vehicle> PickUpSpace;

    public BigTrain() {
        PickUpSpace = new ArrayList<Vehicle>(6);
    }
    @Override
    public void LoadTrain(Vehicle vehicle) throws Exception {
        if (vehicle instanceof Bus || vehicle instanceof Truck) {
            PickUpSpace.add(vehicle);
        } else {
            throw new Exception("Big train can only load trucks and busses");
        }
    }

}
