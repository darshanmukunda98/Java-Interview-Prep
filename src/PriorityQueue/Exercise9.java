package PriorityQueue;

import java.util.PriorityQueue;

public class Exercise9 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
        // Add numbers in the Priority Queue
        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);

    }
}
