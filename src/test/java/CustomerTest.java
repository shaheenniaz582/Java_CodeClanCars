import components.Engine;
import components.Tyres;
import org.junit.Before;
import people.Customer;
import vehicles.Car;
import vehicles.Vehicle;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {
    Customer customer;
    Engine engine;
    Tyres tyres;
    Car car;

    @Before
    public void before(){
        customer = new Customer("John", 10000);
        engine = new Engine(12345, "Audi", "Ad-90");
        tyres = new Tyres("Mud", "XYZ", "XYZ123");
        car = new Car("Audi", "AD-4", "Metallic Silver", 4000,engine,tyres);
    }

    public void customerCanBuyCar(){
        assertEquals(1, customer.buyCar());
    }

}


//    Allow a customer to buy a vehicle.
//        Allow dealership to buy vehicles
//        Allow Dealerships to sell vehicles to customers.
//        Allow damage to be added to a vehicle.
//        This should be a cost and be removed from vehicles price.
//        Allow dealership to repair vehicles.
//        This should take the cost from the dealer and add back to value of vehicle.