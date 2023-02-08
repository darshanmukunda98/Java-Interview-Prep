package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Exercise12 {
    public static void main(String[] args){
        Map< Integer, String > map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        System.out.println(map.values());

    }
}
