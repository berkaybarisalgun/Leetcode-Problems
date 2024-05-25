package String_Encode_and_Decode_NeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public String encode(List<String> strs) {
       StringBuilder stringBuilder=new StringBuilder();

       for(String word:strs){
           stringBuilder.append(word.length()+"#"+word);
       }
       return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;

        while(i<str.length()){
            int hash=str.indexOf('#',i);
            int length=Integer.valueOf(str.substring(i,hash));
            i=hash+length+1;
            list.add(str.substring(hash+1,i));
        }
        return list;
    }
}
