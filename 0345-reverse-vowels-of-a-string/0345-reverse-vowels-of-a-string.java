class Solution {
    public String reverseVowels(String s) {

        boolean isVowel[] = new boolean[128];

        for(char c : "aeiouAEIOU".toCharArray()){
            isVowel[c] = true;
        }

        char ch[]  = s.toCharArray();

        int i = 0, j = ch.length - 1;

        while(i < j){
            while(i < j && !isVowel[ch[i]]){
                i++;
            }
             while(i < j && !isVowel[ch[j]]){
                j--;
            }

            if(i < j){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }
}