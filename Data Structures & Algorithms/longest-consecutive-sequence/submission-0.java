class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashTable = new HashSet<>();

        for(int i = 0; i < nums.length; i++) 
            hashTable.add(nums[i]);

        int count = 0;

        for(Integer i : hashTable) {
            if(!hashTable.contains(i - 1)) {
                int j = i + 1;
                while(hashTable.contains(j))
                    j++;
                count = Math.max(count, j - i);
            }
        }

        return count;
    }
}
