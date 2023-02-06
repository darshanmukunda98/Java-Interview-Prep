package ArrayList;
import java.util.*;
public class Exercise1 {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        //or List<String> li = new ArrayList<String>();

        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("White");
        li.add("Black");
        Collections.addAll(li,"blue","red","black");
        System.out.println(li);

    }
}
