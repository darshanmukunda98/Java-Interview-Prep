package HashMap;
import java.util.*;
public class Exercise1 {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        for (Map.Entry x:map.entrySet()) {
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
