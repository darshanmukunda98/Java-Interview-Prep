package HashSet;
import java.util.*;
public class Exercise6 {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        System.out.println(set);
        HashSet<String> new_set = new HashSet<>();
        new_set = (HashSet<String>) set.clone();
        System.out.println(new_set);

    }
}
