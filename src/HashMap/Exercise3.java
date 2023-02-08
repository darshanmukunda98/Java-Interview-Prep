package HashMap;
import java.util.*;
public class Exercise3 {
    public static void main(String[] args){
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");
        map1.put(4, "White");
        map1.put(5, "Blue");
        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println(map2);

    }
}
