package PriorityQueue;

import java.util.PriorityQueue;

public class Exercise6 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Black");
        pq.add("Pink");
        pq.add("orange");
        System.out.println(pq);
        System.out.println(pq.size());
    }
}
