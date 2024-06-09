package Products_of_Array_Discluding_Self_238;

public class ForbiddenSolution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int product=1;

        for(Integer num:nums){
            product*=num;
        }

        for(int i=0;i<nums.length;i++){
            arr[i]=product/nums[i];
        }
        return arr;
    }
}
