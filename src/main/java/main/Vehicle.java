package main;

public class Vehicle {
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    public Vehicle(String type, String _manufacturer, String _model, int _maxSpeed) {
        manufacturer = _manufacturer;
        model = _model;
        maxSpeed = _maxSpeed;
    }
}
