import java.util.ArrayList;

public class ArrayListLoopExample2 {
    public static void main(String[] args){
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Dallas");
        cities.add("Boston");
        cities.add("San jose");
        cities.add("Chicago");

        String citinames[] = cities.toArray(new String[cities.size()]);

        for(String str: citinames){
            System.out.println(str);
        }


    }
}
