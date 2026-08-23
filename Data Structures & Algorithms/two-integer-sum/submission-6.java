class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store value -> index
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {

                int j = map.get(complement);

                if (i != j) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}