package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("orange");
        System.out.println(list);
        Iterator itr = list.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
