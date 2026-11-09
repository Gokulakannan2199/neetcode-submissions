class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while(left < right) {
            if(!s.substring(left, left + 1).matches("[a-zA-Z0-9]+")) {
                left++;
            }
            else if(!s.substring(right, right + 1).matches("[a-zA-Z0-9]+")) {
                right--;
            }
            else if((s.charAt(left++) | 32) != (s.charAt(right--)| 32))
                return false;
            else
                continue;
            
        }

        return true;
    }
}
