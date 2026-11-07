class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) 
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(Integer key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if(bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        int index = 0;
        int[] res = new int[k];

        for(int i = bucket.length - 1; k > 0 && i >0; i--) {
            if(bucket[i] != null) {
                for(Integer val : bucket[i]) {
                    res[index++] = val;
                    k--;
                    if(k == 0) break;
                }
            }
        }

        return res;
    }
}
