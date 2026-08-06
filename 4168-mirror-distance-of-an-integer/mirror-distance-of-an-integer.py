class Solution:
    def mirrorDistance(self, n: int) -> int:
        rev=0
        a=n
        while(n>0):
            rem=n%10
            rev=rev*10+rem
            n//=10
        return abs(a-rev)