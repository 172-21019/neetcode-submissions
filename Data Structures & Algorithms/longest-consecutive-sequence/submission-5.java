class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 1;
        for(int num : set){
            int count = 0;
            int currNum = num;
            if(!(set.contains(currNum-1))){
                while(set.contains(currNum)){
                    count++;
                    currNum++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
