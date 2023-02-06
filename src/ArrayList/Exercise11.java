package ArrayList;
import java.util.*;
public class Exercise11 {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("White");
        li.add("Black");
        System.out.println("Original order" +li);
        Collections.reverse(li);
        System.out.println("Reverse Order "+li);
        Collections.sort(li);
        System.out.println("Sorted"+li);
        Collections.reverse(li);
        System.out.println("Reverse Sorted"+li);
    }
}
