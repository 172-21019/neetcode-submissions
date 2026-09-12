class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        if(nums.length!=set.size()){
            return true;
        }
        else{
            return false;
        }
    }
}