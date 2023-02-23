package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.addLast("Last");
        li.addFirst("First");
        li.addFirst("FirstNew");
        li.add("Random"); //addLast
        li.remove(); //removeFirst
        li.removeLast();
        li.removeIf((n)->n.equals("Random"));
        Iterator i = li.listIterator(1);
        while(i.hasNext())
            System.out.println(i.next());
        Iterator j = li.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }
        System.out.println(li);
    }
}
