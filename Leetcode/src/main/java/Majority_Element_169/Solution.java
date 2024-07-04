package Majority_Element_169;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        int dividedLength=nums.length/2;
        HashMap<Integer,Integer> hash=new HashMap<>();
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
                if(hash.get(nums[i])>dividedLength){
                    return nums[i];
                }
            }
            else{
                hash.put(nums[i],1);
                if(hash.get(nums[i])>dividedLength){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
