class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        cnt=0
        maxcnt=0
        vowels="aeiou"
        for r in range(k):
            if(s[r] in vowels):
                cnt+=1
        maxcnt=cnt
        for r in range(k,len(s)):
            if(s[r] in vowels):
                cnt+=1
            if s[r-k] in vowels:
                cnt-=1
            maxcnt=max(maxcnt,cnt)
        return maxcnt
