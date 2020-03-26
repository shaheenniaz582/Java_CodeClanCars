package components;

public class Tyres extends Component {
    private String type;


    public Tyres(String type, String make, String model) {
        super(make, model);
        this.type = type;

    }

    public String getType() {
        return type;
    }


}
