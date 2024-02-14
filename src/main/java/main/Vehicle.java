package main;

public class Vehicle {
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    protected String type;
    protected Engine engine;
    public Vehicle(String _type, String _manufacturer, String _model, int _maxSpeed) {
        manufacturer = _manufacturer;
        model = _model;
        maxSpeed = _maxSpeed;
        type = _type;
    }
    public Engine getEngine() {
        return engine;
    }
}
