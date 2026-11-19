class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;

        while(left <= right) {
            mid = left + (right - left + 1) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[left] < nums[mid]) {
                if(nums[left] <= target && nums[mid] > target) right = mid - 1;
                else left = mid + 1;
            }
            else {
                if(nums[right] >= target && nums[mid] < target) left = mid + 1;
                else right = mid - 1;
            }
        }

        return -1;
    }
}
