package Java8;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.IntStream;

// Write a Java 8 program to sort an array and then convert the sorted array into Stream
public class SortAnArrayParallelSort {

    public static void main(String[] args) {

        int arr1[] = { 99, 55, 203, 99, 4, 91 };
        int arr[] = { 99, 55, 203, 99, 4, 91 };

        LocalTime before = LocalTime.now();
        Arrays.sort(arr1);
        System.out.println(LocalTime.now().getNano()-before.getNano());

        before = LocalTime.now();
        Arrays.parallelSort(arr);
        System.out.println(LocalTime.now().getNano()-before.getNano());

        Arrays.stream(arr).forEach(System.out::println);
    }
}
