package Miscellenous;

public class SopraBankingSoftware {
    public static void main(String[] args) {
        System.out.println("Program to print HellWorld 10 times without loop");
//        printWithoutLoop("HelloWorld",0,10);
        //

        System.out.println("if divisible by even only print even, if divisible by odd only print odd, if by both evenoddboth");
        checkForDivisibility(6,false, "odd");
    }

    private static void checkForDivisibility(int num, boolean divisibleByTwo, String res) {
        if(num%2==0){
            num=num/2;
            if(num==1){
                System.out.println("even");
            }else{
                checkForDivisibility(num,true, "odd");
            }
        }else{
            if(divisibleByTwo){
                System.out.println("divisibleevenoddboth");
            }else {
                System.out.println("odd");
            }
        }
    }

    private static void printWithoutLoop(String helloWorld, int i, int numberOfTimes) {
        if(i<numberOfTimes){
            System.out.println(i+"->"+helloWorld);
            printWithoutLoop(helloWorld,i+1,numberOfTimes);
        }
    }
}
