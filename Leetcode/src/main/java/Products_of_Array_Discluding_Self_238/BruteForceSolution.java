package Products_of_Array_Discluding_Self_238;

public class BruteForceSolution {

    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int product=1;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product*=nums[j];
                }
            }
            arr[i]=product;
            product=1;
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }

}
