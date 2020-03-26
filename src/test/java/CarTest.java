import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static junit.framework.TestCase.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine(12345, "Audi", "Ad-90");
        tyres = new Tyres("Mud", "XYZ", "XYZ123");
        car = new Car("Audi", "AD-4", "Metallic Silver", 4000,engine,tyres);
    }

    @Test
    public void carHasEngine(){
        assertEquals(car.getMake(), engine.getMake() );
    }

    @Test

    public void carHasTyres(){
        assertEquals("XYZ",tyres.getMake() );
    }



}
