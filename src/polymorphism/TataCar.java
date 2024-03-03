package polymorphism;

public class TataCar extends Vehicle {
    private String brandName;

    {
        brandName="tata";
    }

    @Override
    public void startEngine() {
        System.out.println("Start the car : " + brandName);
    }
}
