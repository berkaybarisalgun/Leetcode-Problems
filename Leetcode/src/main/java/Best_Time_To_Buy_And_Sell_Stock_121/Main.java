package Best_Time_To_Buy_And_Sell_Stock_121;

public class Main {
    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};

        //Solution solution=new Solution();
        Solution2 solution2=new Solution2();
        //solution.maxProfit(array);
        System.out.println(solution2.maxProfit(array));

    }
}
