package ArrayList;
import java.util.*;
public class Exercise19 {
    public static void main(String[] args){
        ArrayList<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Black");
        li.add("White");
        li.add("Pink");
        System.out.println(li);
        li.trimToSize();
        System.out.println(li);
    }
}
