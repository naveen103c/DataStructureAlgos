package Java8;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        boolean anagram = findAnagram("listen", "silentt");
        if(anagram) System.out.println("Yes it is anagram");
        else System.out.println("NOt");
    }

    private static boolean findAnagram(String s1, String s2) {
        Map<String,Integer> hmap=new HashMap<>();
        if(s1.length()==s2.length()){
            String[] split = s1.split("");
            for (String s : split) {
                if(hmap.get(s)==null){
                    hmap.put(s,1);
                }else {
                    Integer val = hmap.get(s);
                    hmap.put(s,val+1);
                }
            }
            String[] split2 = s2.split("");
            for (String s : split2) {
                    if(hmap.get(s)!=null){
                        int val=hmap.get(s);
                        if(val==1){
                            hmap.remove(s);
                        }else if(val>1){
                            hmap.put(s,val-1);
                        }
                    }
                }
            if (hmap.size()==0)return true;
            }
        return false;
    }
}

//listen and silent
//size is same
//listen  //s
//list=0
