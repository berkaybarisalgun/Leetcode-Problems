package Contains_Duplicate_217;

import java.util.HashSet;

public class Solution3 {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hash=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        if(hash.size()!=nums.length){
            return true;
        }

        return false;
    }
}
