package NeetCode;

import java.util.*;

public class Contains_Duplicate {
    public static void main(String[] args) {
        System.out.println(
                containsDuplicate(new int[]{1, 2, 3, 1})
        );
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if (!set.contains(i))
                set.add(i);
            else
                return true;
        }
        return false;
    }
}
