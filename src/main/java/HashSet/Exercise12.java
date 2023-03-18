package HashSet;
import java.util.*;
public class Exercise12 {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}

