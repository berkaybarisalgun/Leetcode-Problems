package ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;

public class Solution2 {

    public boolean isAnagram(String s, String t) {
        char[] sTest=s.toCharArray();
        char[] tTest=t.toCharArray();
        Arrays.sort(sTest);
        Arrays.sort(tTest);

        return Arrays.equals(sTest,tTest);


    }
}
