package Contains_Duplicate_217;

import java.util.HashMap;

public class Solution2 {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], hash.getOrDefault(hash.get(i), 1));
            }
        }


        boolean hasNonOneValue = hash.values().stream().anyMatch(value -> value != 1);

        return hasNonOneValue;


    }

}
