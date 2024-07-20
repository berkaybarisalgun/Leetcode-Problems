package Isomorphic_Strings_205;

import java.util.HashMap;
import java.util.HashSet;

public class myEffectiveSolution {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hash=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();

        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                if(hash.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                if(set.contains(t.charAt(i))){
                    return false;
                }
            }
            hash.put(s.charAt(i),t.charAt(i));
            set.add(t.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            sb.append(hash.get(s.charAt(i)));
        }

        if(sb.toString().equals(t)){
            return true;
        }

        return false;
    }
}
