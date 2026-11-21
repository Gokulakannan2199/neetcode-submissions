class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0, ind = 0;
        PriorityQueue<int[]> max = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int[] res = new int[nums.length - (k - 1)];

        for(int i = 0; i < k; i++) {
            max.offer(new int[]{nums[i], i});
        } 
        res[ind++] = max.peek()[0];

        for(int i = k; i < nums.length; i++, left++) {
            if(nums[left] == max.peek()[0]) max.poll();
            while(!max.isEmpty() && max.peek()[1] < left) max.poll();
            max.offer(new int[]{nums[i], i});
            res[ind++] = max.peek()[0];
        }

        return res;
        
    }
}
