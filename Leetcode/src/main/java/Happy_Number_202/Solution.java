package Happy_Number_202;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet();
        int temp=n;
        int sum=0;
        while(true){
                sum+=(int)Math.pow(temp%10,2); //91%10 1->^2    91/10=9   9%10 9^2=81 9/10=0
                temp/=10;
                if(temp==0){
                    if(sum==1){
                        return true;
                    }
                    if(set.contains(sum)){
                        return false;
                    }
                    else{
                        set.add(sum);
                        temp=sum;
                        sum=0;
                    }
                }
        }
    }
}
