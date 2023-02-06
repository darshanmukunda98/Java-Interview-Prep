package ArrayList;
import java.util.*;
public class Exercise20 {
    public static void main(String[] args){
        ArrayList<String> li = new ArrayList<>(3);
        li.add("Red");
        li.add("Green");
        li.add("Black");
        System.out.println(li);
        li.ensureCapacity(6);
        li.add("White");
        li.add("Pink");
        li.add("Yellow");
        System.out.println(li);

    }
}
