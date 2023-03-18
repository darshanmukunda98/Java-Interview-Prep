package ArrayList;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("White");
        li.add("Black");
        addColor(li, 4, "Custom");
        //System.out.println(li);
        String ele = li.get(0);
        iterateOverList(li);
        ele = li.get(4);
        iterateOverList(li);
    }

    public static void iterateOverList(List<String> li) {
        Iterator itr = li.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void addColor(List<String> li, int index, String color) {
        li.add(index, color);
    }

}
