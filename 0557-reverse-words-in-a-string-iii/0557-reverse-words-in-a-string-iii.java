class Solution {
    	private static String reverseWord(String str, int start, int end) {
		String reverseWord = "";
		while (start < end) {
			reverseWord = str.charAt(start) + reverseWord;
			start++;
		}
		return reverseWord;
	}
    public String reverseWords(String str) {
        	int n = str.length();
        if(n==0){ //code to check for empty string
            return str;
        }
        int currentStart = 0;
        int i;
        String result = "";
        for(i=0;i<n;i++){
          if(str.charAt(i)==' '){
              int currentEnd = i;
              result = result + reverseWord(str, currentStart, currentEnd) + " ";
              currentStart = i+1;
          }
        }
        //for last word
        int currentEnd = i;
        result = result + reverseWord(str, currentStart,currentEnd);
        return result;
    }
}