package GeeksForGeeks;

import java.util.*;
import java.util.stream.Collectors;

public class Permutation {
    public static void main(String[] args) {
//        String[] arr = new String[]{"125","18","8","6","840","803"};
        String[] arr = new String[]{"5","07","93","2","66","565","90","516","378"};
        permute(arr.length,arr,0, Long.MIN_VALUE);
//        System.out.println(printLargestUsingTreeMap(arr));
    }

    private static long permute(int length, String[] arr, int index, long max) {
        if(index>=(length-1)){
            System.out.println(Arrays.toString(arr));
            max=findSum(arr,max);
//            String max = Arrays.stream(arr).reduce("", (a, b) -> a + b);
//            if(maximum<Long.parseLong(max)){
//                maximum=Long.parseLong(max);
//            }
//            return maximum;
            return max;
        }
        for (int i = index; i < length; i++) {
            swap(arr,index,i);
//            maximum=
            permute(length,arr,index+1,max);
            swap(arr,index,i);
        }
//        return maximum;
        return max;
    }

    private static long findSum(String[] arr, long max) {
        long val=0;
        for (int i = 0; i < arr.length; i++) {
//            val+=Long.parseLong()
        }
    }

    private static void swap(String[] arr, int index, int i) {
        String temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }

    private static String printLargestUsingTreeMap(String[] arr) {
        TreeMap<Double, String> treeMap = new TreeMap<>();
        for (String t: arr) {
            if(treeMap.get(generateKey(t))==null){
                treeMap.put(generateKey(t),t);
            }else{
                String val=treeMap.get(generateKey(t))+t;
                treeMap.put(generateKey(t),val);
            }
        }
        System.out.println(treeMap);
        List<String> collect = treeMap.entrySet().stream().map(t -> t.getValue()).collect(Collectors.toList());
        System.out.println(collect);
        String reduce = treeMap.entrySet().stream().map(t -> t.getValue()).reduce("", (s, c) -> c + s);
        return reduce;
    }

    private static Double generateKey(String a) {
        double size=a.length();
        return Double.parseDouble(a)/(Math.pow(10,size));
    }

}
