class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> st = new Stack<>();

        // index to keep track of the position in the popped arr
        int popIndex = 0;

    // iterate over pushed arr
        for(int num : pushed){
            // 
            st.push(num);

            while(!st.isEmpty() && st.peek() == popped[popIndex]){
                st.pop();
                popIndex++;
            }
        }
        return st.isEmpty();
    }
}