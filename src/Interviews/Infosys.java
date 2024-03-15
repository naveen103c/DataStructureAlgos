package Interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Infosys {
    public static void main(String[] args) {
//        Given an input string. Find the char occuring max times continuously,
//        number of times it is occuring continuously and the starting index of it
//        abcabcssbbb b,8
        String input="aabbbcddbbbbb";
        findMax(input);
    }

    private static void findMax(String input) {
        Map<String,Integer> map=new HashMap<>();
        String[] arr = input.split("");
        Map<String, List<String>> collect = Arrays.stream(arr).collect(Collectors.groupingBy(t -> t));
        System.out.println(collect);
        String pre="";
//        if(arr.length==0){
//            return;
//        } else if (arr.length>0) {
            pre=arr[0];
//        }
//        /
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].equals(pre)){
                //update in hashmap
                if(map.get(arr[i])!=null){
                    int val=map.get(arr[i])+1;
                    map.put(arr[i],val);
                }else{
                    map.put(arr[i],2);
                }
            }
            pre=arr[i];
        }
        System.out.println(map);

    }
}
