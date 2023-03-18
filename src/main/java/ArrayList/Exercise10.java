package ArrayList;
import java.util.*;
public class Exercise10 {
    public static void main(String[] args){
       List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("White");
        li.add("Black");
        System.out.println("Before shuffling"+ li);
        Collections.shuffle(li);
        System.out.println("After shuffling "+li);

    }
}
