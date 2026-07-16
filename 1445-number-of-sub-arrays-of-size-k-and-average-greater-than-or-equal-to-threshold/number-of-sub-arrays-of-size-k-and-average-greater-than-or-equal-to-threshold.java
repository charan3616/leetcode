class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt=0,l=0,r=k-1;
        int sum=0;
        int n=arr.length;
        double avg;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=threshold*k){
            cnt+=1;
        }
        while(r<n-1){
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
        
        
        if(sum>=threshold*k){
            cnt+=1;
        }
        }
        return cnt;
    }
}