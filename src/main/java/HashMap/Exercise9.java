package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise9 {
    public static void main(String[] args){
        Map < Integer, String > map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        Set set = map.entrySet();
        System.out.println(set);
    }
}
