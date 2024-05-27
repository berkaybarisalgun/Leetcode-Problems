package Products_of_Array_Discluding_Self_238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        int left = 0;
        int right = nums.length;
        int leftSum = 1;
        int rightSum = 1;

        for (int i = 0; i < nums.length; i++) {
            while (left != i) {
                leftSum *= nums[left];
                left++;
            }
            while (right - 1 != i) {
                rightSum *= nums[right - 1];
                right--;
            }
            arr[i] = leftSum * rightSum;
            left = 0;
            right = nums.length;
            leftSum = 1;
            rightSum = 1;
        }

        return arr;
    }
}
