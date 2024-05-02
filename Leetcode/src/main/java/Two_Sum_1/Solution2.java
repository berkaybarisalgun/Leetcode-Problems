package Two_Sum_1;

import java.util.HashMap;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int[] arr=new int[2];

        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int search=target-temp;
            if(hash.containsKey(search)){
                arr[0]=i;
                arr[1]=hash.get(search);
            }
            hash.put(nums[i],i);
        }
        return arr;
    }
}
