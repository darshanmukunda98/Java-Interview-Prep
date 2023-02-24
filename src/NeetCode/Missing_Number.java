package NeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Missing_Number {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
    public static int missingNumber(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Integer sum = Arrays.stream(nums).reduce(0,(a,b)->a+b);
        int act_sum = nums.length*(nums.length+1)/ 2;
        return act_sum - sum;
    }
}
