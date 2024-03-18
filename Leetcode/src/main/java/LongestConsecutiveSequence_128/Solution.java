package LongestConsecutiveSequence_128;

import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int fin=0;
        int count=1;
        int begin=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[begin]==nums[begin+1]-1&&nums[begin]!=nums[begin+1]){
                count++;
                begin++;
                if(nums[i+1]==nums[nums.length-1]){
                    fin=count;
                }
            }
            else{
                if(count>fin){
                    fin=count;
                }
                count=0;
                begin=i+1;
            }
        }

        return fin;
        

    }
}
