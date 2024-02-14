package main;

public class Plane extends Vehicle {
    public Plane(String _manufacturer, String _model, int _maxSpeed) {
        super("lentokone", _manufacturer, _model, _maxSpeed);
        engine = new Engine("Suihkumoottori", 500);
    }
    public void fly() {
        System.out.println(manufacturer + " " + model + " lentää kohteeseen!");
    }
}
