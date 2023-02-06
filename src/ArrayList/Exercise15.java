package ArrayList;
import java.util.*;
public class Exercise15 {
    public static void main(String[] args){
        List<String> li1 = new ArrayList<>();
        li1.add("Red");
        li1.add("Green");
        li1.add("Black");
        li1.add("White");
        li1.add("Pink");
        System.out.println(li1);
        List<String> li2 = new ArrayList<>();
        li2.add("Red");
        li2.add("Green");
        li2.add("Black");
        li2.add("Pink");
        System.out.println(li2);

        li1.addAll(li2);
        System.out.println("Appending li2 to li1"+li1);

    }
}
