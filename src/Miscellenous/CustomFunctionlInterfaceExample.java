package Miscellenous;

@FunctionalInterface
public interface CustomFunctionlInterfaceExample {
    abstract int calculateSquare(int x);
}

class FunInterfaceImplUsingLambda{
    public static void main(String[] args) {
        CustomFunctionlInterfaceExample customFunctionlInterfaceExample = (int x) -> x * x;
        int square = customFunctionlInterfaceExample.calculateSquare(6);
        System.out.println("square from FunInterfaceImplUsingLambda way: "+square);

        HelloWorldFunctionalInterface hello_world_from_lambda = () -> System.out.println("Hello World from Lambda");
        hello_world_from_lambda.sayHello();
    }
}

//traditionalWay
class TraditionFunInterfaceImpl implements CustomFunctionlInterfaceExample, HelloWorldFunctionalInterface{

    public static void main(String[] args) {
        TraditionFunInterfaceImpl traditionFunInterface=new TraditionFunInterfaceImpl();
        int square=traditionFunInterface.calculateSquare(5);
        System.out.println("square from traditional way: "+square);

        traditionFunInterface.sayHello();

    }

    @Override
    public int calculateSquare(int x) {
        return x*x;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello world traditional way");
    }
}

@FunctionalInterface
interface HelloWorldFunctionalInterface{
    void sayHello();
}