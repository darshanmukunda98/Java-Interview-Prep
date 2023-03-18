package ArrayList;
import java.util.*;
public class Exercise17 {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Black");
        li.add("White");
        li.add("Pink");
        System.out.println("original array"+li);
        li.removeAll(li);
        System.out.println("remove all array elements"+li);
    }
}
