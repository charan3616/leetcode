class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        sum=0
        maxsum=0
        i=0
        j=len(nums)-1
        m=k
        for r in range(0,k):
            sum+=nums[r]
        maxsum=sum
        while(m<=j):
            sum-=nums[i]
            sum+=nums[m]
            i+=1
            m+=1
            maxsum=max(maxsum,sum)
        avg=maxsum/k
        return avg

        