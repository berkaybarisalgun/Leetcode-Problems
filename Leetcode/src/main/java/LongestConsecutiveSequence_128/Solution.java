package LongestConsecutiveSequence_128;

import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);



        int max = 0;
        int count=0;

        for(int i=0;i<nums.length-1;i++){
            System.out.println(nums[i]);
            System.out.println(nums[i+1]);

            if(nums[i]+1==nums[i+1]){

                count++;
                System.out.println("i+1:"+(i+2));
                System.out.println("length:"+nums.length);
                if((i+2)==nums.length){
                    System.out.println("buradayim");
                    max=count;
                    return max+1;
                }
            }
            else{
                if (count > max) {
                    max=count;
                    count=0;
                }
            }
            System.out.println("count:"+count);
            System.out.println("----------------");
        }
        return max+1;
    }
}
