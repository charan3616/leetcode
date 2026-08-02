class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        x=sum(nums)
        y=0
        for num in nums:
            while(num>0):
        
                y+=num%10
                num//=10
        return abs(x-y)
        