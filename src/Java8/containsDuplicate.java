package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
public class containsDuplicate {
    public static void main(String[] args) {
        int numArr1[]= {1,2,4,5,1};
        System.out.println("It contains Duplicate:"+containsDuplicateMethod(numArr1));
        int numArr2[]= {1,2,4,5};
        System.out.println("It don't contain Duplicate:"+containsDuplicateMethod(numArr2));
    }

    private static boolean containsDuplicateMethod(int[] numArr1) {
        boolean flag = true;
        Set<Integer> set=new HashSet<>();
        List<Integer> collectedList = Arrays.stream(numArr1).filter(p -> set.add(p)).boxed().collect(Collectors.toList());
        if(collectedList.size()==numArr1.length){
            flag=false;
        }
        return flag;
    }
}
