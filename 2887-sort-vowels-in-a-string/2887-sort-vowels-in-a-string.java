class Solution {

    boolean isVowel(Character c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String sortVowels(String s) {
        int count[] = new int[100];

        for(char c : s.toCharArray()){
            if(isVowel(c)){
                count[c - 'A']++;
            }
        }

        String sortedVowels = "AEIOUaeiou";
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(!isVowel(s.charAt(i))){
                ans.append(s.charAt(i));
            } else{
                while(count[sortedVowels.charAt(j) - 'A'] == 0){
                    j++;
                }
                ans.append(sortedVowels.charAt(j));
                count[sortedVowels.charAt(j) - 'A']--;
            }
        }
        return ans.toString();
    }
}