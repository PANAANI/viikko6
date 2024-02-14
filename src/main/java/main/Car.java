package main;

public class Car extends Vehicle {
    private Engine engine;
    public Car(String _manufacturer, String _model, int _maxSpeed) {
        super("auto", _manufacturer, _model, _maxSpeed);
        engine = new Engine("V8", 300);
    }
    public Engine getEngine() {
        return engine;
    }
}
