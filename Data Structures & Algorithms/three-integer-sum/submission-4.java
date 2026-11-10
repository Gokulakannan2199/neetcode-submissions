class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int rem, left, right;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            if(nums[i] > 0) break;
            rem = nums[i];
            left = i + 1;
            right = nums.length - 1;
            while(left < right) {
                if((rem + nums[left] + nums[right]) < 0) left++;
                else if((rem + nums[left] + nums[right]) > 0) right--;
                else {
                    res.add(List.of(rem, nums[left], nums[right]));
                    left++;
                    while(nums[left] == nums[left - 1] && left < right) left++;
                }
            }
            
        }
        
        return res;
        
    }
}
