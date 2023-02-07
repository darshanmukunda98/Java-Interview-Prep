package HashSet;
import java.util.*;
public class Exercise4 {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        System.out.println(set);
        set.removeAll(set);
        System.out.println(set);

    }
}
