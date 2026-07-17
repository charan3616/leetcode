class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<>();
        int left=0,right=0;
        int maxlen=0;
        while(right<s.length()){
            while(h.contains(s.charAt(right))){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;

}    
}