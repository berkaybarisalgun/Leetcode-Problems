package Majority_Element_169;

import java.util.Arrays;

public class Solution2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2]; //best solution so far
    }
}
