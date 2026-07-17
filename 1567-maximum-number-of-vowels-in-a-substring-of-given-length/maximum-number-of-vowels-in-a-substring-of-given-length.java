class Solution {
    public int maxVowels(String s, int k) {
        int vowels=0,maxvowels=0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowels++;
            }
        }

            maxvowels=vowels;
            for(int i=k;i<s.length();i++){
                if (isVowel(s.charAt(i-k))) {
                vowels--;
            }
                
                if (isVowel(s.charAt(i))) {
                vowels++;
            }
               
           maxvowels=Math.max(maxvowels,vowels);
           if(maxvowels==k){
            return k;
           }
            }     
            return maxvowels;
    }
            
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
        
        
    

}
