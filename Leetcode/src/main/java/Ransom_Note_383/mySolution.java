package Ransom_Note_383;

import java.util.HashMap;

public class mySolution {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character, Integer> hash = new HashMap<>();

            for(int i=0;i<ransomNote.length();i++){
                hash.put(ransomNote.charAt(i),hash.getOrDefault(ransomNote.charAt(i), 0)+1);
            }

            for(int i=0;i<magazine.length();i++){
                hash.put(magazine.charAt(i),hash.getOrDefault(magazine.charAt(i), 0)-1);
            }


            boolean result=hash.values().stream()
                    .anyMatch(value -> value>0);

            return !result;


        }
    }
}
