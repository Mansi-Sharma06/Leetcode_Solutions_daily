class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        Stack<Character> charStack = new Stack<>();
        int deleteCount = 0;

        for(int i = 0; i < n; i++){
            // if stack not empty, top of stack is 'b', current char is 'a'
            if(!charStack.isEmpty() && charStack.peek() == 'b' && s.charAt(i) == 'a'){
                charStack.pop(); // remvove 'b' from stack
                deleteCount++;
            } else{
                charStack.push(s.charAt(i)); // push current char in stack
            }
        }
        return deleteCount;
    }
}