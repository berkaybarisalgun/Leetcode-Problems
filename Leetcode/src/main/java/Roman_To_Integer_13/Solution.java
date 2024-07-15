package Roman_To_Integer_13;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);

        int index=0;
        int sum=0;
        if(s.length()==1){
            return hash.get(s.charAt(0));
        }
        while(index<s.length()){
            int first=hash.get(s.charAt(index));
            if(index==s.length()-1){
                sum+=first;
                return sum;
            }
            int second=hash.get(s.charAt(index+1));
            if(first<second){
                sum-=first;

            }
            else{
                sum+=first;
            }
            index++;
        }
        return sum;
    }
}
