package ArrayList;
import java.util.*;
public class Exercise9 {
    public static void main(String[] args){
        List<String> li1 = new ArrayList<>();
        li1.add("1");
        li1.add("2");
        li1.add("3");
        li1.add("4");
        System.out.println("List 1: "+ li1);
        List<String> li2 = new ArrayList<>();
        li2.add("A");
        li2.add("B");
        li2.add("C");
        li2.add("D");
        System.out.println("List 2: "+ li2);
        Collections.copy(li1,li2);
        System.out.println(li1);
        System.out.println(li2);



    }
}
