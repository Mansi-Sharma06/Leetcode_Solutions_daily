class Solution {
    public int isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='u' || c=='o')
            return 1;
        return 0;
    } 
    public int maxVowels(String s, int k) {
        // int maxVowel = 0;
        // int currVowel = 0;
        // for(int i = 0; i < s.length(); i++){
        //     currVowel += isVowel(s.charAt(i));
        //     if(i >= k){
        //         currVowel -= isVowel(s.charAt(i - k));
        //         maxVowel = Math.max(maxVowel, currVowel);
        //     }
        // }
        // return maxVowel;
        
        int n = s.length();
        int ans = 0;
        int max = 0;
        for(int i=0; i<k; i++)
            ans += isVowel(s.charAt(i));
        max = ans;
        for(int i=1; i<=n-k; i++){
            ans = ans - isVowel(s.charAt(i-1)) + isVowel(s.charAt(i+k-1));
            max = Math.max(max,ans);
        }
        return max;
    }
}