package ArrayList;
import java.util.*;
public class Exercise14 {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Black");
        li.add("White");
        li.add("Pink");
        System.out.println("Before swapping"+li);

        Collections.swap(li,0,2);
        System.out.println("After swapping"+li);
    }
}
