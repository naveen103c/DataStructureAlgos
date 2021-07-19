package Miscellenous;

import java.util.Map;
import java.util.TreeMap;

public class CountFreqTreeMap {
   //O(logn) Time Complexity
    public static void main(String ards[]) {
        int arr[] = {10, 34, 5, 10, 3, 5, 10};
        printFreq(arr);
    }

    private static void printFreq(int[] arr) {
        TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            Integer c = tmap.get(arr[i]);
            if (tmap.get(arr[i]) == null) {
                tmap.put(arr[i], 1);
            } else {
                tmap.put(arr[i], ++c);
            }
        }
        for (Map.Entry mp : tmap.entrySet()) {
            System.out.println(mp.getKey() + "  -  " + mp.getValue());
        }
    }

}
