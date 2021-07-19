package Miscellenous;

import java.util.HashMap;
import java.util.Map;

public class CountFreqHashMap {

    public static void main(String[] args) {
        int arr[] = {10, 34, 5, 10, 3, 5, 10};
        //printFreq(arr);
        //differentapproach
        printfreq(arr);
    }
    //O(n) time complexity

    private static void printFreq(int arr[]) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            Integer c = hmap.get(arr[i]);
            System.out.println("c "+c);
            if (hmap.get(arr[i]) == null) {
                hmap.put(arr[i], 1);
            } else {
                hmap.put(arr[i], ++c);
            }
        }
        for(Map.Entry m:hmap.entrySet())
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
    }
        private static void printfreq(int arr[]) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (hmap.get(arr[i]) == null) {
                hmap.put(arr[i], 1);
            } else {
                count=hmap.get(arr[i]);
                hmap.put(arr[i], ++count);
            }
        }
        for(Map.Entry m:hmap.entrySet())
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
    }
}
