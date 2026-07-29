class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        if ch not in word:
            return word
        i=0
        arr=list(word)
        pos = word.index(ch)
        while(i<pos):
            if(ch in word):
                arr[i],arr[pos]=arr[pos],arr[i]
                i+=1
                pos-=1
        return "".join(arr)
        