package PriorityQueue;

import java.util.PriorityQueue;

public class Exercise11 {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("Original Priority Queue: "+pq1);
        String str1;
        str1 = pq1.toString();
        System.out.println(str1);
    }
}
