package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Java 8 program to perform cube on list elements and filter numbers greater than 50
public class CubeOfANumber {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList=integerList.stream().map(p->p*p*p).filter(s->s>50).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
