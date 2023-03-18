package NeetCode;

public class Two_Sum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[] {2,7,11,15},9));
    }
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for(int i = 0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++)
            {
                if(i!=j && (nums[i]+nums[j]) == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return null;
    }
}
