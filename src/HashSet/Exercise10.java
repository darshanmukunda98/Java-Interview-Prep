package Hashset1;
import java.util.*;
public class Exercise10 {
    public static void main(String[] args){
       Set<String> set1 = new HashSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Black");
        set1.add("White");
        System.out.println(set1);
        Set<String> set2 = new HashSet<>();
        set2.add("Red");
        set2.add("Pink");
        set2.add("Black");
        set2.add("Orange");
        System.out.println(set2);
        Set<String> result = new HashSet<>();
        for(String e : set1){
            System.out.println(set2.contains(e)?"Yes":"No");
        }
    }
}
