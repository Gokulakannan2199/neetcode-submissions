class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1, mid;
        int ans = Integer.MAX_VALUE;

        while(left <= right) {
            mid = left + (right - left + 1) / 2;
            ans = Math.min(nums[mid], ans);
            if(nums[mid] > nums[right]) left = mid + 1;
            else right = mid - 1;
        }

        return ans;
    }
}
