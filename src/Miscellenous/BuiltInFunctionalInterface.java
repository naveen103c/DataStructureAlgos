package Miscellenous;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterface {
    public static void main(String[] args) {

        //Consumer Example
        Consumer<String> consumer = (c)->System.out.println(c);
        consumer.accept("Consumer Functional INterface example");

        //predicate example
        Predicate<Integer> predicate =(t)-> (t == 1);
        System.out.println(predicate.test(1));
        System.out.println(predicate.test(2));

        //Supplier example
        Supplier<String> supplier=()->"I am a producer functional INterface";
        System.out.println(supplier.get());

        //functionExample

    }
}
