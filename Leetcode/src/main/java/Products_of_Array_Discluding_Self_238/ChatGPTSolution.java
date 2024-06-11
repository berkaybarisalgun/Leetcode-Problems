package Products_of_Array_Discluding_Self_238;

public class ChatGPTSolution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        // Initialize the result array with 1 for multiplication.
        result[0] = 1;
        // Calculate the products of elements to the left of each index.
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Variable to store the products of elements to the right of each index.
        int right = 1;
        // Calculate the products of elements to the right of each index and update the result array.
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }

}
