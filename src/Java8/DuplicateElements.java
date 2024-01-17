package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//How to find duplicate elements in a given integers list in java using Stream functions
public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> newSet=new HashSet<>();
        list = list.stream().filter(p -> !newSet.add(p)).collect(Collectors.toList());
        System.out.println(list);
    }
}
