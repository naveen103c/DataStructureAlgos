package polymorphism;

public class Vehicle {
    private int seat;
    private int wheel;

    public void startEngine(){
        System.out.println("Start the engine");
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}

