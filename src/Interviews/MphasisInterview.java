package Interviews;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MphasisInterview {
    public static void main(String[] args) {
        String input="welcometogeeksforgeeks";
        Map<String, Integer> map=new HashMap<>();
        map.put("a",0);
        map.put("b",0);
        map.put("c",0);
        map.put("d",0);
        map.put("e",0);
        map.put("f",0);
        map.put("g",0);
        map.put("h",0);
        map.put("i",0);
        map.put("j",0);
        map.put("k",0);
        map.put("l",0);
        map.put("m",0);
        map.put("n",0);
        map.put("o",0);
        map.put("p",0);
        map.put("q",0);
        map.put("r",0);
        map.put("s",0);
        map.put("t",0);
        map.put("u",0);
        map.put("v",0);
        map.put("w",0);
        map.put("x",0);
        map.put("y",0);
        map.put("z",0);
        missingAlphabets(input,map);
    }

    private static void missingAlphabets(String input, Map<String, Integer> map) {
//        input=input.trim();
        String[] inputArr = input.split("");
        for (String str:inputArr) {
            Integer val = map.get(str);
            map.put(str,val+1);
        }
        List<String> output = map.entrySet().stream().filter(t -> t.getValue() == 0).map(t -> t.getKey()).collect(Collectors.toList());

        System.out.println(output);
        String collect = map.entrySet().stream().filter(t -> t.getValue() == 0).map(t -> t.getKey()).collect(Collectors.joining());
        System.out.println(collect);
    }
}
