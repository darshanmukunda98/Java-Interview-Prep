package ArrayList;
import java.util.*;
public class Exercise5 {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("White");
        li.add("Black");
        System.out.println(li);
        li.set(2,"Yellow");
        System.out.println(li);


    }
}
