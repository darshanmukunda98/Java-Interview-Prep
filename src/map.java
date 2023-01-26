import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class map {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        int[] array = {1, 5, 8};
        myList.add(1);
        myList.add(5);
        myList.add(8);

        Stream<Integer> myStream = myList.stream();
        //prints an array as string
        System.out.println(Arrays.toString(Arrays.stream(array).map(n -> n + 1).toArray()));
        //
        myStream.map(n -> n + 1).forEach(System.out::println);
    }
}
