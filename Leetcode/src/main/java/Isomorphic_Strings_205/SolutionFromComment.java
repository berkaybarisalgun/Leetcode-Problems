package Isomorphic_Strings_205;

import java.util.HashMap;

public class SolutionFromComment {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> hashS=new HashMap<>();
        HashMap<Character,Integer> hashT=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        int len=s.length();

        for(int i=0;i<len;i++){
            if(hashS.containsKey(s.charAt(i))&&!hashT.containsKey(t.charAt(i))) return false;
            if(!hashS.containsKey(s.charAt(i))&&hashT.containsKey(t.charAt(i))) return false;

            if(!hashS.containsKey(s.charAt(i))&&!hashT.containsKey(t.charAt(i))){
                hashS.put(s.charAt(i),i);
                hashT.put(t.charAt(i),i);
            }
            else{
                if(!hashS.get(s.charAt(i)).equals(hashT.get(t.charAt(i)))) return false;
                hashS.put(s.charAt(i),i);
                hashT.put(t.charAt(i),i);
            }
        }
        return true;
    }
}
