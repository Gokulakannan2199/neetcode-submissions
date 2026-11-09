class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while(left < right) {
            if(!isAlphaNumeric(s.charAt(left))) {
                left++;
            }
            else if(!isAlphaNumeric(s.charAt(right))) {
                right--;
            }
            else if((s.charAt(left++) | 32) != (s.charAt(right--)| 32))
                return false;
            else
                continue;
            
        }

        return true;
    }

    public boolean isAlphaNumeric(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }
}
