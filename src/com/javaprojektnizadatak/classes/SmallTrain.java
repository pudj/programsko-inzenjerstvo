package com.javaprojektnizadatak.classes;

import com.javaprojektnizadatak.interfaces.TrainLoader;

import java.util.ArrayList;

public class SmallTrain implements TrainLoader {

    public ArrayList<Vehicle> PickUpSpace;

    public SmallTrain() {
        PickUpSpace = new ArrayList<Vehicle>(8);
    }
        @Override
        public void LoadTrain(Vehicle vehicle) throws Exception {
            if (vehicle instanceof Car || vehicle instanceof Van) {
                PickUpSpace.add(vehicle);
            } else {
                throw new Exception("Small train can only load cars and vans");
            }

        }

}

