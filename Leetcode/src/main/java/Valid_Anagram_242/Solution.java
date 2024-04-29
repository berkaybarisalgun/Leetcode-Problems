package Valid_Anagram_242;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        char[] sChar=s.toCharArray();
        char[] tChar=t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);


        String modifiedS=Arrays.toString(sChar);
        String modifiedT=Arrays.toString(tChar);

       if(modifiedT.equals(modifiedS))
           return true;
        return false;
    }
}