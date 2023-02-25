package PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Exercise10 {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("Original Priority Queue: "+pq1);
        List<String> list = new ArrayList<>(pq1);
        System.out.println(list);
    }
}
