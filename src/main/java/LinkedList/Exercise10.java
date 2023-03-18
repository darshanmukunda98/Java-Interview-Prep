package LinkedList;

import java.util.LinkedList;

public class Exercise10 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        // print original list
        System.out.println("Original linked list:" + l_list);
        String first  = l_list.getFirst();
        String last = l_list.getLast();
        System.out.println(first+" " +last);
    }
}
