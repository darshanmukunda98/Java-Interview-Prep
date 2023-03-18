package NeetCode;

import java.util.*;

public class Three_Sum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int sum = 0;
        Set<List<Integer>> li = new HashSet<>();
        for(int i = 0 ;i < nums.length;i++){
            for(int j = 0;j< nums.length;j++){
                for(int k = 0;k<nums.length;k++){

                    if((i != j && i != k && j != k) && nums[i] + nums[j] + nums[k] == 0)
                    {
                        /*List<Integer> temp = new ArrayList<>(List.of(nums[i],nums[j],nums[k]));
                        Collections.sort(temp);
                        li.add(temp);*/
                    }
                }
            }
        }

        System.out.println(new ArrayList<>(li));
        return null;
    }

}
