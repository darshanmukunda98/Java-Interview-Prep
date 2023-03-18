package LinkedList;

import java.util.LinkedList;

public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("Red");
        li.add("Green");
        li.add("Black");
        li.add("White");
        //System.out.println(li);
        for(String element : li){
            System.out.println(element);
        }
    }
}
