package EncodeAndDecodeStrings;

import java.util.*;

public class Solution {



    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append("/").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
            List<String> res=new ArrayList<>();
            int i=0;
            while(i< str.length()){
                int slash=str.indexOf('/',i);
                int size=Integer.valueOf(str.substring(i,slash));
                i=slash+size+1;
                res.add(str.substring(slash+1,i));
            }
            return res;
}
}
