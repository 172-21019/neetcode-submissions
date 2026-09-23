class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        List<Integer> newArray = new ArrayList<>(set);
        Collections.sort(newArray);
        int longest=1;
        int count = longest;
        for(int i=0; i<newArray.size()-1; i++){
            if((newArray.get(i+1)-newArray.get(i))==1){
                longest++;
                count = Math.max(count, longest);
            }
            else{
                longest = 1;
            }
        }
        return count;
    }
}
