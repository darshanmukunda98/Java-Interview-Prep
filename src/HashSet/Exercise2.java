package HashSet;
import java.util.*;
public class Exercise2 {
public static void main(String[] args){
    Set<String> set = new HashSet<>();
    set.add("Red");
    set.add("Green");
    set.add("Black");
    set.add("White");
    set.add("Pink");
    set.add("Yellow");
    Iterator itr = set.iterator();
    while(itr.hasNext())
        System.out.println(itr.next());
}
}
