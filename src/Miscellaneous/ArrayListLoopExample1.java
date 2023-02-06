package Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLoopExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        System.out.println("Using Advanced Loop ");
        System.out.println(al);
        for (Integer num : al) {
            System.out.println(num);
        }

    }
}
