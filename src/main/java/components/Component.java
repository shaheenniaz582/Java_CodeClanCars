package components;

public  abstract class Component  {
    private String make;
    private String model;
    //Composition

    public Component(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
