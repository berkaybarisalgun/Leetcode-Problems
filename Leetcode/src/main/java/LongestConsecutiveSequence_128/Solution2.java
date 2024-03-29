package LongestConsecutiveSequence_128;

public class Solution2 {

    public int longestConsecutive(int[] nums) {
        int longestStreak = 0;

        for (int num : nums) {
            System.out.println(num);
            int currentNum = num;
            int currentStreak = 1;


            while (arrayContains(nums, currentNum + 1)) {
                currentNum++;
                currentStreak++;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }

        return longestStreak;
    }

    private boolean arrayContains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }


}
