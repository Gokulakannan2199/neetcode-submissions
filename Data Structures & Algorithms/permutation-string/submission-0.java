class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        
        int[] freq = new int[26];
        int[] prem = new int[26];

        for(int i = 0; i < s1.length(); i++) { freq[s1.charAt(i) - 97]++; }

        String str1 = Arrays.toString(freq);

        int ptr = 0, ind;

        for(ind = 0; ind < s1.length(); ind++) { prem[s2.charAt(ind) - 97]++; }

        String str2 = Arrays.toString(prem);

        if(str1.equals(str2)) return true;

        for(int i = ind; i < s2.length(); i++) {
            prem[s2.charAt(ptr++) - 97]--;
            prem[s2.charAt(i) - 97]++;

            if(str1.equals(Arrays.toString(prem))) return true;
        }
        
        return false;

    }
}
