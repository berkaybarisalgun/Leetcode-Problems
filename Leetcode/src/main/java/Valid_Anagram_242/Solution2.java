package Valid_Anagram_242;

import java.util.HashMap;

public class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            hash.put(charS, hash.getOrDefault(charS, 0) + 1);
            hash.put(charT, hash.getOrDefault(charT, 0) - 1);
        }

        for (Integer c : hash.values()) {
            if (c != 0) {
                return false;
            }
        }

        return true;

    }
}
