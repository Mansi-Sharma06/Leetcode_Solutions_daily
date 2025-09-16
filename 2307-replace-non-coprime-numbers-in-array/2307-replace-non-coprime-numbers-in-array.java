class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for(int num : nums){
            while(!stack.isEmpty()){
                int top = stack.peek();
                int gcd = gcd(top, num);
                if(gcd == 1){
                    break;
                }
                stack.pop();
                num = (top / gcd) * num; // LCM
            }
            stack.push(num);
        }
        return new ArrayList<>(stack);
    }

    private int gcd(int a, int b){
        if(b == 0)
        return a;

        return gcd(b, a % b);
    }
}