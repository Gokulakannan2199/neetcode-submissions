class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0, ind = 0;
        PriorityQueue<Integer> max = new PriorityQueue<>                    (Collections.reverseOrder());
        int[] res = new int[nums.length - (k - 1)];

        for(int i = 0; i < k; i++) {
            max.offer(nums[i]);
        } 
        res[ind++] = max.peek();

        for(int i = k; i < nums.length; i++, left++) {
            if(nums[left] == max.peek()) max.poll();
            else max.remove(nums[left]);
            max.offer(nums[i]);
            res[ind++] = max.peek();
        }

        return res;
        
    }
}
