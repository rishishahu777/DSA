public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Edge check: Array of size 1 or k equal to array length
        if (nums.length == 1) {
            return new int[]{nums[0]};
        }

        // 1. Frequency Map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 2. Extract unique keys
        List<Integer> uniqueNumbers = new ArrayList<>(frequencyMap.keySet());

        // 3. Sort by frequency in descending order
        uniqueNumbers.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // 4. Collect top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueNumbers.get(i);
        }

        return result;
    }
}