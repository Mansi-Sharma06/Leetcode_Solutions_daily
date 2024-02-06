class Solution {
    public String reverseWords(String s) {
        
        String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int end = words.length - 1;
        for(int i = 0; i<= end; i++){
            if(!words[i].isEmpty()) {
                sb.insert(0, words[i]);
                if(i < end) sb.insert(0, " ");
            }
        }
        return sb.toString();
    }
}

// class Solution {
//     public String reverseWords(String s) {
        
//         int end = s.length();
// 		int i = s.length() - 1;
// 		String Output = "";
// 		while (i >= 0) {
// 			if (s.charAt(i) == ' ') {
// 				Output = Output + s.substring(i + 1, end) + " ";
// 				end = i;
// 			}
// 			i--;
// 		}
// 		Output = Output + s.substring(i + 1, end);
// 		return Output;
        
//     }
// }