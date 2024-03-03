package Interviews;

import java.util.HashMap;
import java.util.Map;

public class Mphasisint {
    public static void main(String[] args) {
        String input="aabbaaa";
        findoutput(input);

    }

    private static void findoutput(String input) {
        String[] arr = input.split("");
        String output="";String last="";

        Map<String, Integer> map=new HashMap<>();
        for (String str:arr) {
            if(map.get(str)==null && last!=""){
                //extract and save
               output=outputEntry(map,output,last);
//               a3,"",a
//                b1,a3,b
            }
            last=str;
            if(map.get(str)!=null){
                Integer val = map.get(str);
                map.put(str,val+1);
            }else{
                map.put(str,1);
            }
        }
        output=outputEntry(map,output,last);
        System.out.println(output);
    }

    private static String outputEntry(Map<String, Integer> map, String output, String last) {
        output+=last+map.get(last);
        map.remove(last);
        //a3b1
        return output;
    }
}
