package Kth_Distinct_String_in_an_Array;

import java.util.HashMap;

public class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hash=new HashMap();
        for(int i=0;i<arr.length;i++){
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }

        int count=0;
        for(String s:arr){
            if(hash.get(s)==1){
                count++;
                if(count==k){
                    return s;
                }
            }
        }
        return "";
    }
}
