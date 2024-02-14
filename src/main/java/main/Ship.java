package main;

public class Ship extends Vehicle {
    public Ship(String _manufacturer, String _model, int _maxSpeed) {
        super("laiva", _manufacturer, _model, _maxSpeed);
        engine = new Engine("Wärtsilä Super", 1000);
    }
    public void sail() {
        System.out.println(manufacturer + " " + model + " seilaa merten ääriin!");
    }
}
