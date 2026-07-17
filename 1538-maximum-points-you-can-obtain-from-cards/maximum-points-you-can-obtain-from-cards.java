class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0,l=k-1,r=cardPoints.length-1;
        int maxsum=0,sum1=0,m=k-1;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxsum=sum;
        while(l>=0){
            sum=sum-cardPoints[l];
            l--;
            sum=sum+cardPoints[r];
            r--;
        
        maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}