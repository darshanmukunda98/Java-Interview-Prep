package HashSet;
import java.util.*;
public class Exercise1 {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Red 1");
        set.add("Green 2");
        set.add("Black 3");
        set.add("White 4");
        set.add("Pink 5");
        set.add("Yellow 6");
        set.add("Yellow 7");

        System.out.println("The HashSet "+set);

    }
}
