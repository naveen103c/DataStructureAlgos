package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Write a Java 8 program to concatenate two Streams
public class ConcatenateTwoStreams {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        Stream<String> concatedStream=Stream.concat(list1.stream(),list2.stream());
        concatedStream.forEach(System.out::println);
    }
}
