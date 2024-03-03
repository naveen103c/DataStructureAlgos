package polymorphism;

public class CallingMethod {
    public static void main(String[] args) {
        TataCar t=new TataCar();
        t.startEngine();

        Vehicle v=new TataCar();
        v.startEngine();

        Vehicle v1=new TeslaCar();
        v1.startEngine();

        TataCar t1= (TataCar) new Vehicle();
        t1.startEngine();

        TataCar t2= (TataCar) new Vehicle();
        t2.startEngine();


    }
}
