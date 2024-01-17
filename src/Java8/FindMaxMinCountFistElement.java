package Java8;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the maximum value element present in it using Stream functions
public class FindMaxMinCountFistElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream().findFirst().ifPresent(p-> System.out.println(p));

        long count = myList.stream().count();
        System.out.println("count:"+count);

        int max = myList.stream().max((p1, p2) -> p1.compareTo(p2)).get();
        System.out.println("max:"+max);

        int min = myList.stream().min((p1, p2) -> p1.compareTo(p2)).get();
        System.out.println("min:"+min);

    }
}
