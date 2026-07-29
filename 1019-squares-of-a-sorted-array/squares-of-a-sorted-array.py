class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        k=0
        for i in range(0,len(nums)):
            nums[k]=nums[i]*nums[i]
            k+=1
        a=sorted(nums)
        return a
            
        