package ArrayList;
import java.util.*;
public class Exercise2 {
    public static void main(String[] args)
    {
        List<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("White");
        li.add("Black");
        for (String ele : li){
            System.out.println(ele);
        }
        //using Iterator
        Iterator itr = li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
