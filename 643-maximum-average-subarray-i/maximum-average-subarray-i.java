class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double avg=0;
        int l=0;
        int r=k-1;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        while(r<n-1){
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
           maxsum=Math.max(maxsum,sum);

        }
                    avg=((double) maxsum)/k;
        return avg;
        
    }
}