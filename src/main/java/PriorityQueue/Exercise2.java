package PriorityQueue;

import java.util.PriorityQueue;

public class Exercise2 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Orange");
        pq.add("White");
        pq.add("Black");
        for(String e : pq){
            System.out.println(e);
        }

    }
}
