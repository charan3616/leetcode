class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        digits=[]
        for i in range(0,len(nums)-1):
            for j in range(i+1,len(nums)):
                if(nums[i]+nums[j]==target):
                    digits.append(i)
                    digits.append(j)
                    return digits
        return digits

        
        