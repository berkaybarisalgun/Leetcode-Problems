package ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;

public class Solution3 {

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) - 1);
        }
        System.out.println(map);

        System.out.println();

        if (map.values().stream().anyMatch(value->value!=0)) {
            return false;
        }
        return true;
    }

}
