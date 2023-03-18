package ArrayList;

import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        List<String> li1 = new ArrayList<>();
        li1.add("Red");
        li1.add("Green");
        li1.add("Black");
        li1.add("White");
        li1.add("Pink");
        List<String> li2 = new ArrayList<>();
        li2.add("Red");
        li2.add("Green");
        li2.add("Black");
        li2.add("Pink");
        List<String> li3 = new ArrayList<>();
        for (String e : li1)
            li3.add(li2.contains(e) ? "Yes" : "No");
        System.out.println(li3);
    }
}

