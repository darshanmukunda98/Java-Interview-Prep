package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Exercise6 {
    public static void main(String[] args){
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");
        map1.put(4, "White");
        map1.put(5, "Blue");
        System.out.println(map1);
        HashMap<Integer,String> map2 = new HashMap<>();
        map2 = (HashMap)map1.clone();
        System.out.println(map2);

    }
}
