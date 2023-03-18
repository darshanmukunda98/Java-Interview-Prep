package ArrayList;
import java.util.*;
public class Exercise21 {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<String>();
        list1.add("Green");
        list1.add("Red");

        System.out.print("First time list is: "+list1+" \n");

        list1.set(1, "White");
        System.out.println(list1);
    }
}
