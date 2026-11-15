class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";

        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> winMap = new HashMap<>();

        for(int i = 0 ; i < t.length(); i++) 
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        
        int need = tMap.size(), have = 0;
        int left = 0, len = Integer.MAX_VALUE;
        int[] res = new int[]{-1, -1};

        boolean flag = false;

        for(int right = 0; right < s.length(); right++) {
            Character ch = s.charAt(right);
            winMap.put(ch, winMap.getOrDefault(ch, 0) + 1);
            if(tMap.containsKey(ch) && winMap.get(ch).equals(tMap.get(ch)))  
                have++;
            while(need == have) {
                if((right - left + 1) < len) {
                    res[0] = left; res[1] = right;
                    len = right - left + 1;
                    flag = true;
                }
                ch = s.charAt(left);
                winMap.put(ch, winMap.get(ch) - 1);
                if(tMap.containsKey(ch) && winMap.get(ch) < tMap.get(ch)) 
                    have--;
                left++;
            }
        }

        return flag ? s.substring(res[0], res[1] + 1) : "";

    }
}
