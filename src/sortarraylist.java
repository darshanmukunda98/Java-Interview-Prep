import java.util.*;

public class sortarraylist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       ArrayList<Integer> al = new ArrayList<Integer>();

       String temp[] = s.nextLine().split(" ");
       for(int i = 0;i < temp.length;i++){
           al.add(Integer.parseInt(temp[i]));
       }
       System.out.println("These are the numbers ");
        Collections.sort(al);
       System.out.println(al);


    }
}
