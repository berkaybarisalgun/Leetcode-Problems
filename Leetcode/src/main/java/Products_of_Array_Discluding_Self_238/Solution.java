package Products_of_Array_Discluding_Self_238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        int left = 0;
        int right = nums.length-1;
        int leftSum = 1;
        int rightSum = 1;

        for(int i=0;i<nums.length;i++){
            while(left<i){
                leftSum*=nums[left];
                left++;
            }
            while(right>i){
                rightSum*=nums[right];
                right--;
            }
            arr[i] = leftSum * rightSum;
            leftSum=1;
            rightSum=1;
            left=0;
            right=nums.length-1;
        }
        return arr;
    }
}
