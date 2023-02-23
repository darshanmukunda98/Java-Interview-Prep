package NeetCode;

import java.util.*;

public class Contains_Duplicate {
    public static void main(String[] args) {
        System.out.println(
                containsDuplicate(new int[]{1, 2, 3, 1})
        );
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if (!map.containsKey(i))
                map.put(i,1);
            else
                return true;
        }
        return false;
    }
}
