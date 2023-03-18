package NeetCode;

import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> s = new ArrayList<>();
        Map<String,List<String>> map = new LinkedHashMap<>();
        for(String e : strs){
            char[] ch = e.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);

            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(e);
        }
        s.addAll(map.values());
        return s;
    }
}
