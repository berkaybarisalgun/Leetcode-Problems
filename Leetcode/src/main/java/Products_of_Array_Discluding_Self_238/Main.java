package Products_of_Array_Discluding_Self_238;

public class Main {
    public static void main(String[] args) {
        BruteForceSolution bruteForceSolution =new BruteForceSolution();
        Solution solution=new Solution();
        ForbiddenSolution forbiddenSolution=new ForbiddenSolution();

        int[] array=new int[6];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        array[5]=0;

        //forbiddenSolution.productExceptSelf(array); in here we have divide by "0" problem
        //optSol.productExceptSelf(array);
        //bruteForceSolution.productExceptSelf(array);
        solution.productExceptSelf(array);
    }
}
