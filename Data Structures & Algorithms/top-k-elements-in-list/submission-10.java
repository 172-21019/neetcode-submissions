class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        // Step 3: Keep heap size capped at k
        for (int num : map.keySet()) {
            minHeap.offer(num);
            
        }

        // Step 4: Extract the top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
