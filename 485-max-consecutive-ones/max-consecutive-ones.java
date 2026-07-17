class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0,cnt=0;
        int maxones=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==1){
                cnt+=1;
            }
            if(nums[right]==0){
                
                left=right+1;
            }
            maxones=Math.max(right-left+1,maxones);
        }
        return maxones;
        
    }
}