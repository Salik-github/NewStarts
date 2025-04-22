package learning.Stringproblem;

import java.util.HashMap;
import java.util.Map;

public class Countoccurrences {
    public static void main(String[] args) {
        String b ="salikK";
        Map<Character,Integer> count = new HashMap<>();
        String a =b.toLowerCase();
        for(int i=0;i<a.length();i++)
        {
            if(count.containsKey(a.charAt(i)))
            { 
                 count.put(a.charAt(i),count.get(a.charAt(i))+1);
            }
            else
            {
                count.put(a.charAt(i), 1);
            }
        }
        System.out.println(count);
    }
}
