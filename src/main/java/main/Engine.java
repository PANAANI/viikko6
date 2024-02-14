package main;

public class Engine {
    private String name;
    private int power;
    public Engine(String _name, int _power) {
        name = _name;
        power = _power;
    }  
    public String getName() {
        return name;
    }
    public int getPower() {
        return power;
    }
}
