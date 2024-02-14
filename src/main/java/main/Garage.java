package main;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> garageVehicles = new ArrayList<Vehicle>();
    public void listVehicles() {
        for (Vehicle i : garageVehicles) {
            switch (i.type) {
                case "auto":
                    System.out.println("Auto: " + i.manufacturer + " " + i.model);    
                    break;
                case "laiva":
                    System.out.println("Laiva: " + i.manufacturer + " " + i.model);    
                    break;
                case "lentokone":
                    System.out.println("Lentokone: " + i.manufacturer + " " + i.model);    
                    break;
                default:
                    System.out.println("Virheellinen Vehicle-olio, ei tyyppiä.");
                    break;
            }
            System.out.println("Moottori: " + i.getEngine().getName() + " " + i.getEngine().getPower() + "kW");
            System.out.println("Huippunopeus: " + i.maxSpeed + "km/h" + "\n");
        }
    }
    public void addVehicle(Vehicle vehicle) {
        garageVehicles.add(vehicle);
    }
}
