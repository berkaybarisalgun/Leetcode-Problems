package Products_of_Array_Discluding_Self_238;

public class BestSolution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[nums.length-1]=1;
        for(int i=nums.length-2;i>-1;i--){
            right[i]=right[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            arr[i]=left[i]*right[i];
        }

        return arr;
    }
}
