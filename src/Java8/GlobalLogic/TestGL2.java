package Java8.GlobalLogic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestGL2 {

    public static void main(String[] args) {
//        System.out.println("abc");

        String input="aaabbcd";
        printDuplicateCharacters(input);
    }

    private static void printDuplicateCharacters(String input) {
        String[] arr = input.split("");

//        Map<String, Integer> map=new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(map.containsKey(arr[i])){
//                Integer val = map.get(arr[i]);
//                map.put(arr[i],val+1);
//            }else{
//                map.put(arr[i],1);
//            }
//        }
        List<String> collectedList = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(t -> t.getValue() > 1).map(t -> t.getKey()).collect(Collectors.toList());
        System.out.println(collectedList);
        Map<String, List<String>> collect = Arrays.stream(arr).collect(Collectors.groupingBy(t -> t));
        System.out.println(collect);
        Map<String, Integer> collect1 = collect.entrySet().stream().collect(Collectors.toMap(t -> t.getKey(), t -> t.getValue().size()));
        System.out.println(collect1);
        List<String> collect2 = collect1.entrySet().stream().filter(t -> t.getValue() > 1).map(t -> t.getKey()).collect(Collectors.toList());
        System.out.println(collect2);
    }

}
