class Solution {
    public int maxArea(int[] heights) {
        int capcity, maxCap = 0;

        int left = 0, right = heights.length - 1;

        while(left < right) {
            capcity = (right - left) * Math.min(heights[left], heights[right]);
            maxCap = Math.max(maxCap, capcity);
            if(heights[left] < heights[right]) left++;
            else right--;

        }

        return maxCap;
    }
}
