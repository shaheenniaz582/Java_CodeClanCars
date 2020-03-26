package vehicles;

import components.Engine;
import components.Tyres;

public class HybridCar extends Car {
    public HybridCar(String make, String model, String color, int price, Engine engine, Tyres tyres) {
        super(make, model, color, price, engine, tyres);
    }
}
