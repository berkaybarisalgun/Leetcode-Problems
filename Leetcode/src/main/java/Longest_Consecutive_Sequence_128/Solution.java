package Longest_Consecutive_Sequence_128;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int max=0;

        for(int num:nums){
            if(!numSet.contains(num-1)){
                int length=1;
                while(numSet.contains(num+length)){
                    length++;
                }
                max=Math.max(max,length);
            }
        }
        return max;
    }
}
