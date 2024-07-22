package Word_Pattern_290;

import java.util.HashMap;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sWord = s.split(" ");
        char[] charArray = pattern.toCharArray();
        HashMap<Character, String> hash = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        if (charArray.length != sWord.length) {
            return false; // Eğer uzunluklar eşit değilse direk false döner
        }

        for (int i = 0; i < charArray.length; i++) {
            if (!hash.containsKey(charArray[i])) {
                if (hash.containsValue(sWord[i])) {
                    return false;
                }
                hash.put(charArray[i], sWord[i]);
            } else if (!hash.get(charArray[i]).equals(sWord[i])) {
                return false;
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            sb.append(hash.get(charArray[i]));
        }

        return sb.toString().equals(s.replaceAll(" ",""));
    }
}
