package vehicles;

import components.Component;
import components.Engine;
import components.Tyres;

public class Car extends Vehicle {
    public Car(String make, String model, String color, int price, Engine engine, Tyres tyres) {
        super(make, model, color, price, engine, tyres);
    }

}
