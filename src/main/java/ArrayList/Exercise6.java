package ArrayList;
import java.util.*;
public class Exercise6 {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("White");
        li.add("Black");
        System.out.println(li);
        li.remove(4);
        System.out.println(li);
    }
}
