package Interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Capgemini {
    public static void main(String[] args) {
        String s="naveenchaudhary";
        findduplicate(s);
    }

    private static void findduplicate(String s) {
        String[] arr=s.split("");
        Map<String, Long> collect1 = Arrays.stream(arr).collect(Collectors.groupingBy(t -> t, Collectors.counting()));
        System.out.println(collect1);
        Map<String, Long> collect = collect1
                .entrySet()
                .stream().filter(t -> t.getValue() > 1)
                .collect(Collectors.toMap(t -> t.getKey(), t -> t.getValue()));
        System.out.println(collect);

//        intercetpot
//                employeeName
//
//
//        /cust/getCust
//        /cust/*

    }
}
