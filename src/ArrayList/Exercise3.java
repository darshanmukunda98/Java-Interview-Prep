package ArrayList;
import java.util.*;
public class Exercise3 {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("White");
        li.add("Black");
        System.out.println(li);
        li.add(0,"First");
        li.add(5, "Last");
        System.out.println(li);
    }
}
