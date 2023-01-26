import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLoopExample {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(3);
        al.add(17);
        al.add(20);
        //print entire arraylist
        System.out.println(al);
        //print in a for each loop
        for(Integer num : al)
        System.out.println(num);

        //Convert it into primitive array
        int[] arr = al.stream().mapToInt(i -> i).toArray();
        //for(int i : arr)
        //System.out.println(i);
        System.out.println(Arrays.toString(arr));
    }
}
