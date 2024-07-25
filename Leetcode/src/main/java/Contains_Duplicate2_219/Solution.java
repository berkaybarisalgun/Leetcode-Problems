package Contains_Duplicate2_219;

import java.util.HashMap;

public class Solution { 
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap();

        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                Integer i1 = hash.get(nums[i]);
                if(Math.abs(i-i1)<=k){
                    return true;
                }
                hash.put(nums[i],i);
            }
            else{
                hash.put(nums[i],i);
            }
        }
        return false;
    }
}
