import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample4 {
    public static void main(String[] args){
        String[] arr = {"a","b","c","d"};
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
        al.addAll(List.of(arr));
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        System.out.println(al);
        System.out.println(al.size());
    }
}
