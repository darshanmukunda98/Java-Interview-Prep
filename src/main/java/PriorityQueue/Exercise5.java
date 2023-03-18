package PriorityQueue;

import java.util.PriorityQueue;

public class Exercise5 {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println(pq1);
        pq1.clear();
        System.out.println(pq1);
    }
}
