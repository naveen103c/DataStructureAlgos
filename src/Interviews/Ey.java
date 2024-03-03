package Interviews;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ey {
    public static void main(String[] args) {
        String input="naveen";
        checkDuplicate(input);

        String a="Naveen";
        String b=new String("Naveen");
        System.out.println(a instanceof String);
        System.out.println(b instanceof String);
        System.out.println(a.equals(b));
        System.out.println(a==b);

        StringBuffer buffer1=new StringBuffer("Naveen");
        StringBuffer buffer2=new StringBuffer("Naveen");
        System.out.println(buffer1.equals(buffer2));
        System.out.println(buffer1.equals(buffer2));

    }

    private static void checkDuplicate(String input) {
        String[] arr = input.split("");
        List<String> output = Arrays.stream(arr)
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()))
                .entrySet().stream().filter(t -> t.getValue() > 1)
                .map(t -> t.getKey()).collect(Collectors.toList());
        System.out.println(output);

    }
}
