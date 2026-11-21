class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> max = new ArrayDeque<>();
        int[] res = new int[nums.length - (k - 1)];

        for(int i = 0; i < nums.length; i++) {
            while(!max.isEmpty() && max.peekFirst() <= i - k) max.pollFirst();
            while(!max.isEmpty() && nums[max.peekLast()] <= nums[i]) 
                max.pollLast();
            max.offerLast(i);
            if(i >= k - 1) res[i - k + 1] = nums[max.peekFirst()];
        }

        return res;
        
    }
}
