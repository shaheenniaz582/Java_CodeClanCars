package vehicles;

import components.Engine;
import components.Tyres;

public abstract class Vehicle {

    // Instance Variables
    private String make;
    private String model;
    private String color;
    private int price;
    // Composition
    private Engine engine;
    private Tyres tyres;

    //Constructor

    public Vehicle(String make, String model, String color, int price, Engine engine, Tyres tyres) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.engine = engine;
        this.tyres = tyres;
    }

    // Getters

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    // Methods
}
