package components;

public class Engine extends Component {

    private int chassisNo;


    public Engine(int chassisNo, String make, String model) {
        super(make,model);
        this.chassisNo = chassisNo;

    }

    public int getChassisNo() {
        return chassisNo;
    }
}
