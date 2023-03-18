package LinkedList;

import java.util.LinkedList;

public class Exercise5 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add(0,"Yellow");
        System.out.println(l_list);
    }
}
