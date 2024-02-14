package main;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> garageVehicles = new ArrayList<Vehicle>();
    public void listVehicles() {
        for (Vehicle i : garageVehicles) {
            System.out.println(i.model);
        }
    }
    public void addVehicle(Vehicle vehicle) {
        garageVehicles.add(vehicle);
    }
}
