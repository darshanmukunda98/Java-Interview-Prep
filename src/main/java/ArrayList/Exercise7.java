package ArrayList;
import java.util.*;
public class Exercise7 {
    public static void main(String[] args){
        ArrayList<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("White");
        li.add("Black");
        if(li.contains("Red"))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
