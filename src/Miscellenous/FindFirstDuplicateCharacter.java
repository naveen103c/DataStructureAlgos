package Miscellenous;

import java.util.*;

public class FindFirstDuplicateCharacter {

    public static void main(String[] args) {
        String str="cnvabcanbdbcnv";
        System.out.println(findFirstDuplicateCharacterMethod(str));

//        no order
//        Set<Integer> set=new HashSet<>();
//        preserve insertion order
        Set<Integer> set=new LinkedHashSet<>();

//        sorting order
//        Set<Integer> set=new TreeSet<>();
        set.add(52);set.add(4);set.add(10);set.add(5);set.add(2);set.add(4);set.add(90);set.add(5);set.add(0);set.add(4);set.add(11);set.add(5);
        System.out.println(set);



    }

    private static String findFirstDuplicateCharacterMethod(String str) {
        String[] charArr = str.split("");

//        Map<String,Integer> map=new HashMap<>();

//        To preserve sequence use LinkedHashMap
        Map<String,Integer> map=new LinkedHashMap<>();

//        To save the data in Sorting order
//        Map<String,Integer> map=new TreeMap<>();

        for (int i = 0; i < charArr.length; i++) {
            if(map.containsKey(charArr[i])){
                map.put(charArr[i],map.get(charArr[i])+1);
            }else {
                map.put(charArr[i],1);
            }
        }
        System.out.println(map);
        String key = map.entrySet().stream().filter(t -> t.getValue() > 1).findFirst().get().getKey();
        return key;
    }



}
