import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample4 {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("F");
        al.add("E");
        al.add("D");
        al.add("C");
        al.add("B");
        al.add("A");
        Collections.sort(al);
        System.out.println(al);
        //ascending order
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
        //descending order
        al.remove(0);
        System.out.println(al);
        al.add(0,"F");
        al.set(0,"replaced");
        System.out.println(al);


    }
}
