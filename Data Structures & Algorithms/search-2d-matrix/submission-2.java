class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length - 1;
        int mid;
        while(left <= right) {
            mid = left + (right - left + 1) / 2;
            if(matrix[mid][0] <= target && matrix[mid][matrix[0].length - 1] >= target) {
                int l = 0, r = matrix[0].length - 1, m;
                while(l <= r) {
                    m = l + (r - l + 1) / 2;
                    if(matrix[mid][m] == target) return true;
                    else if(matrix[mid][m] > target) r = m - 1;
                    else l = m + 1;
                }
                break;
            }
            else if(matrix[mid][0] > target) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}
