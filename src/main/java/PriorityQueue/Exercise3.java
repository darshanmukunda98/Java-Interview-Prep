package PriorityQueue;

import java.util.PriorityQueue;

public class Exercise3 {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.add("Red");
        queue1.add("Green");
        queue1.add("Orange");
        System.out.println(queue1);
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("Pink");
        queue2.add("White");
        queue2.add("Black");
        System.out.println(queue2);
        queue1.addAll(queue2);
        System.out.println(queue1);
    }
}
