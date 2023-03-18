package ArrayList;
import java.util.*;
public class Exercise18 {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Black");
        li.add("White");
        li.add("Pink");
        System.out.println("Original array list"+li+" isEmpty "+li.isEmpty());
        li.removeAll(li);
        System.out.println("Original array list"+li+" isEmpty "+li.isEmpty());



    }
}
