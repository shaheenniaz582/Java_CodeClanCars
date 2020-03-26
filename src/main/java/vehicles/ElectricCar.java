package vehicles;


import components.Engine;
import components.Tyres;
import vehicles.Vehicle;

public class ElectricCar extends Vehicle  {

    public ElectricCar(String make, String model, String color, int price, Engine engine, Tyres tyres) {
        super(make, model, color, price, engine, tyres);
    }


}
