package NeetCode;

import java.util.Arrays;
import java.util.OptionalInt;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int pist = 0;
        int op = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(pist > op)
                op = pist;
        }
        return op;
    }
}
