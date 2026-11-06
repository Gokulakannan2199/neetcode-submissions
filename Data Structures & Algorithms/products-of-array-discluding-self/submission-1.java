class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        int product = 1;

        for(int i = 1; i < nums.length; i++) {
            product *= nums[i - 1];
            res[i] = product;
        } 

        product = 1;

        for(int i = nums.length - 1; i > 0; i--) {
            product *= nums[i];
            res[i - 1] *= product;
        }

 
        return res;
    }
}  
