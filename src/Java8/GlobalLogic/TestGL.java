package Java8.GlobalLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestGL {
    public static void main(String[] args) {

        List<String> nameList=new ArrayList<>();
        nameList.add("abc");
        nameList.add("abc");
        nameList.add("xyz");
        nameList.add("abc");
        nameList.add("zyx");

        nameOcc(nameList);
    }

    private static void nameOcc(List<String> nameList) {
        Map<String, Integer> names = nameList.stream().collect(Collectors.groupingBy(t -> t)).
                entrySet().stream().collect(Collectors.toMap(t1 -> t1.getKey(), t2 -> t2.getValue().size()));
        System.out.println(names);
    }
}
