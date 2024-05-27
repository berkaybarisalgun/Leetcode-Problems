package Products_of_Array_Discluding_Self_238;

public class Main {
    public static void main(String[] args) {
        BruteForceSolution bruteForceSolution =new BruteForceSolution();
        Solution solution=new Solution();

        int[] array=new int[4];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;

        //bruteForceSolution.productExceptSelf(array);
        solution.productExceptSelf(array);
    }
}
