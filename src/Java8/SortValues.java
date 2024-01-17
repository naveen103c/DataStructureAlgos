package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, sort all the values present in it using Stream functions
public class SortValues {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> listAsc = myList.stream().sorted().collect(Collectors.toList());
        System.out.println(listAsc);
        List<Integer> listDesc = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listDesc);
    }
}
