class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0, ptr = 0;

        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= ptr) {
                ptr = map.get(s.charAt(i)) + 1;
            }
            map.put(s.charAt(i), i);
            count = Math.max(count, (i - ptr + 1));
        }

        
        return count;

    }
}
