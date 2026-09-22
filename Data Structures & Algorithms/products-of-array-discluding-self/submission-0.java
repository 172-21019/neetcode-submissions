class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int zeroCount = 0;
        int totalProduct=1;
        for(int num : nums){
            if(num==0){
                zeroCount++;
            }
            else{
                totalProduct*=num;
            }
        }
        if(zeroCount > 1){
            return new int[nums.length];
        }
        for(int i = 0; i<nums.length; i++){
            if(zeroCount == 1){
                if(nums[i]==0){
                    result[i] = totalProduct;
                }
                else{
                    result[i] = 0;
                }
            }
            else{
                result[i] = totalProduct / nums[i];
            }
        }
        return result;
    }
}  
