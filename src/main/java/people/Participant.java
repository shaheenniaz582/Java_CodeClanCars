package people;

import vehicles.Vehicle;

import java.util.ArrayList;

public abstract class Participant {

    private String name;
    private ArrayList<Vehicle> vehicles;
    private int totalMoney;

    public Participant(String name,  int totalMoney) {
        this.name = name;
        this.totalMoney = totalMoney;
        vehicles = new ArrayList<Vehicle>() ;

    }

    public void buyVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
}
