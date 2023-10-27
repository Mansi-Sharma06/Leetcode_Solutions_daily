class Solution {
    public String longestPalindrome(String s) {

        // expand from the centre
        
        int max_len = 1;
        int n = s.length();
        int start = 0;
        int end = 0;

        // odd length 

        for(int i = 0; i < n-1; i++){
            int l = i;
            int r =i;
            while(l >=0 && r < n){
                if(s.charAt(l) == s.charAt(r)){
                    l--;
                    r++;
                }
                else
                break; 
            }
            int len = r-l-1;
            if(len > max_len){
                max_len = len;
                start = l+1;
                end = r-1;
            }
        }

        // even length 

         for(int i = 0; i < n-1; i++){
            int l = i;
            int r =i+1;
            while(l >=0 && r < n){
                if(s.charAt(l) == s.charAt(r)){
                    l--;
                    r++;
                }
                else
                break; 
            }
            int len = r-l-1;
            if(len > max_len){
                max_len = len;
                start = l+1;
                end = r-1;
            }
        }
        return s.substring(start, end +1);


    //      // all substring approach

    //     for(int length = s.length(); length > 0; length--){
    //         for(int start = 0; start <= s.length()-length; start++){
    //             if(check(start, start+length, s)){
    //                 return s.substring(start, start+length);
    //             }
    //         }
    //     }
    //     return "";
    // }
    // private boolean check(int i, int j, String s){
    //     int left = i;
    //     int right = j-1;

    //     while(left < right){
    //         if(s.charAt(left) != s.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    }
}