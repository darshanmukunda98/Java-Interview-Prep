package ArrayList;

import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("White");
        li.add("Black");
        System.out.println("Original "+li);
        System.out.println("Sub-list "+li.subList(0,2));
    }
}

