class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        cnt=0
        sum=0
        j=0
        m=k
        for i in range(k):
            sum+=arr[i]
        if(sum/k>=threshold):
                cnt+=1
        while(m<len(arr)):
            sum-=arr[j]
            sum+=arr[m]
            j+=1
            m+=1
            avg=sum/k
            if(avg>=threshold):
                cnt+=1
        return cnt


        