package ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }

            char d=t.charAt(i);
            if(map2.containsKey(d)){
                map2.put(d,map2.get(d)+1);
            }
            else{
                map2.put(d,1);
            }
            i++;

        }
        if(map.equals(map2)){
            return true;
        }


    return false;

    }
}

/*
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */