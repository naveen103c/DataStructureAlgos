package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, find out all the numbers starting with 1 using Stream functions
public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,3,46,78,644,13,45,76,8,99);
        List<String> newList = list.stream().map(s -> s + "").filter(p -> p.startsWith("1")).collect(Collectors.toList());
        System.out.println(newList);
    }
}
