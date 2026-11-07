class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            
            Integer rem = map.get(target - nums[i]);

            if(rem != null) return new int[]{rem, i};

            map.put(nums[i], i);
        }

        return null;

    }
}
