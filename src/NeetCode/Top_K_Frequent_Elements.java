package NeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{1,1,1,2,2,4,4,4,4,4,4,4,4,4,3},2));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int n : nums)
            freqMap.put(n, freqMap.getOrDefault(n,0)+1);

        int[] res = new int[k];
        for(int t = 0;t<k;t++){
            int max_value = 0;
            int max_key = 0;
            Integer[] values = freqMap.values().toArray(new Integer[0]);
            Integer[] keys = freqMap.keySet().toArray(new Integer[0]);
            for(Integer i = 0;i< freqMap.size();i++){

                if(values[i.intValue()] > max_value ){
                    max_value = values[i.intValue()];
                    max_key = keys[i.intValue()];
                }

            }
            System.out.println("K = "+max_key+" V = "+max_value);
            freqMap.remove(max_key);
            res[t] = max_key;
        }
        return res;
    }
}
