package Miscellaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListExample5 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        int sum = al.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);
        al = al.stream().map(x -> x + 2).toList();
        System.out.println(al);
    }
}
