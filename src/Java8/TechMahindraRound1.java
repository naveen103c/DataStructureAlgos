package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class TechMahindraRound1 {
    public static void main(String[] args) {
        String sentance="This is is my code play code code";
        CheckDuplicateWord(sentance);
    }
//@GetMapping
//    method(int id, @Optional strig pa)
    private static void CheckDuplicateWord(String sentance) {
        Map<String, Integer> hmap=new HashMap<>();
        String[] words = sentance.split(" ");

//        Map<String, List<String>> collect = Arrays.stream(words).collect(Collectors.groupingBy(t->t));
//        collect.entrySet().stream().filter((t1)->t1.getValue().size()>1).forEach((t1)-> System.out.println(t1.getKey()+":"+t1.getValue().size()));

        Arrays.stream(words).collect(Collectors.groupingBy(t->t))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(t->t.getKey(),t->t.getValue().size()))
                .entrySet()
                .stream()
                .filter(t->t.getValue()>1)
                .collect(Collectors.toMap(t->t.getKey(),t->t.getValue()))
                .entrySet()
                .forEach(t-> System.out.println(t.getKey()+":"+t.getValue()));

        Arrays.stream(words).collect(Collectors.groupingBy(t->t))
                .entrySet()
                .stream()
                .filter(t->t.getValue().size()>1)
                .collect(Collectors.toMap(t->t.getKey(),t->t.getValue().size()))
                .entrySet()
                .forEach(t-> System.out.println(t.getKey()+":"+t.getValue()));
    }
}
