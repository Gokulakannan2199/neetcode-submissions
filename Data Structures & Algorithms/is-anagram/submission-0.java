class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 97]++;
        }

        for(int j = 0; j < s.length(); j++) {
            if(freq[t.charAt(j) - 97] == 0) return false;
            freq[t.charAt(j) - 97]--;
        }

        for(int i : freq) if(i != 0) return false;

        return true; 
    }
}
