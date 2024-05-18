package Group_Anagrams_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hash=new HashMap<>();

        for(String word:strs){
            char[] s=word.toCharArray();
            String notSorted=new String(s);
            Arrays.sort(s);
            String sorted=new String(s);
            hash.computeIfAbsent(sorted,k -> new ArrayList<>()).add(notSorted);
        }
        return new ArrayList<>(hash.values());
    }
}
