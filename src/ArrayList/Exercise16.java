package ArrayList;
import java.util.*;
public class Exercise16 {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Black");
        li.add("White");
        li.add("Pink");
        System.out.println("Original array "+li);
        List<String> newli = new ArrayList<>(li);
        System.out.println("Cloned array");
        System.out.println(newli);
    }
}
