package Top_K_Frequent_Elements_347;

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> hash = new HashMap<>();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((n1, n2) -> hash.get(n1) - hash.get(n2));// hangisi daha küçükse ona öncelik veriyor. default olarak.

        for (Integer num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        for (int n : hash.keySet()) {
            priorityQueue.add(n);
        }
        System.out.println(priorityQueue+"\n");
        System.out.println(priorityQueue.element());


        for (int i = 0; i < k; i++) {
            arr[i] = priorityQueue.poll();
        }


        return arr;

    }
}
