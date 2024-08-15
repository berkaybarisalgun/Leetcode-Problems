package Longest_Consecutive_Sequence_128;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        SolutionSort solutionSort=new SolutionSort();

        int[] nums={1,2,0,1};

        System.out.println(solutionSort.longestConsecutive(nums));
        System.out.println(solution.longestConsecutive(nums));


    }

}
