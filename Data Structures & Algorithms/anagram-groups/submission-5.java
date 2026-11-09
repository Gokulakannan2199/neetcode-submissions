class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        int[] freq = new int[26];

        for(String s : strs) {
            for(int i = 0; i < 26; i++) freq[i] = 0;

            for(int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }
            map.computeIfAbsent(Arrays.toString(freq), k -> 
                                new ArrayList<>()).add(s);
        }
    
        return new ArrayList<>(map.values());

    }

}
