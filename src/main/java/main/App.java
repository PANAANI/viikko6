package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Garage garage = new Garage();
        String choice = "";
        while (!choice.equals("0")) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            if (sc.hasNext()) {
                choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                        String vehicleType = sc.nextLine();
                        System.out.println("Anna kulkuneuvon valmistaja:"); 
                        String manufacturer = sc.nextLine();
                        System.out.println("Anna kulkuneuvon malli:");
                        String model = sc.nextLine();
                        System.out.println("Anna kulkuneuvon huippunopeus:");
                        int maxSpeed = Integer.parseInt(sc.nextLine());
                        switch (vehicleType) {
                            case "1":
                                Car newCar = new Car(manufacturer, model, maxSpeed);
                                garage.addVehicle(newCar);
                                break;
                            case "2":
                                Plane newPlane = new Plane(manufacturer, model, maxSpeed);
                                garage.addVehicle(newPlane);
                                break;                       
                            case "3":
                                Ship newShip = new Ship(manufacturer, model, maxSpeed);
                                garage.addVehicle(newShip);
                                break;
                            default:
                                System.out.println("Syöte oli väärä");
                                break;
                        }
                        break;
                    case "2":
                        garage.listVehicles(); 
                        break;                       
                    case "3":
                        garage.driveCars(); 
                        break;
                    case "4":
                        garage.flyPlanes();
                        break;
                    case "5":
                        garage.sailShips();
                        break;
                    case "0":
                        System.out.println("Kiitos ohjelman käytöstä.");
                        sc.close(); 
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
    }
}
