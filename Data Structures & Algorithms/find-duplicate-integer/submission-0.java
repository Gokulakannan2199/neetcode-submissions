class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length + 1];
        for(int i : nums) {
            if(freq[i] > 0) return i;
            freq[i]++;
        }

        return -1;

    }
}
