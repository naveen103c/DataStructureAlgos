package polymorphism;

public class TeslaCar extends Vehicle {
    private String brandName;


    {
        brandName="tesla";
    }

    @Override
    public void startEngine() {
        System.out.println("Start the car : "+brandName);
    }
}
