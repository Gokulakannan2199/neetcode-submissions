class TimeMap {
    private Map<String, List<String>> map;
    private Map<String, List<Integer>> timeStamp;
    public TimeMap() {
        this.map = new HashMap<>();
        this.timeStamp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        this.map.computeIfAbsent(key, k-> new ArrayList<>()).add(value);
        this.timeStamp.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        if(timeStamp.get(key).get(0) > timestamp) return "";
        
        int left = 0, right = timeStamp.get(key).size() - 1;
        String ans = "";

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(timeStamp.get(key).get(mid) < timestamp) {
                ans = map.get(key).get(mid);
                left = mid + 1;
            }
            else if(timeStamp.get(key).get(mid) > timestamp) right = mid - 1;
            else return map.get(key).get(mid);
        }

        return ans;
    }
}
