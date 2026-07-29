class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        ans = [0] * len(nums)
        k = len(nums) - 1
        i=0
        j=len(nums)-1
        while i<=j:
            if(nums[i]**2>nums[j]**2):
                ans[k]=nums[i]**2
                i+=1
            else:
                ans[k]=nums[j]**2
                j-=1
            k-=1
        return ans
            
        