package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, find out all the even numbers that exist in the list using Stream functions
public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,3,46,78,644,33,45,76,8,99);
        list = list.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println(list);
    }
}
