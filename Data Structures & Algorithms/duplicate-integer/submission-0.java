class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }

        if(nums.length != hashSet.size()) return true;

        return false;
    }
}