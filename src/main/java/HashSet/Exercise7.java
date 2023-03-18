package HashSet;
import java.util.*;
public class Exercise7 {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        System.out.println(set);
        String[] new_array = new String[set.size()];
        set.toArray(new_array);
        for(String e : new_array){
            System.out.println(e);
        }
    }
}
