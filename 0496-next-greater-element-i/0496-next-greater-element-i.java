class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numtonext = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
       
        
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek() < num)
                numtonext.put(stack.pop(), num);
            stack.push(num);
        }
        
        for(int num : nums1){
            if(numtonext.containsKey(num))
                ans.add(numtonext.get(num));
            else
                ans.add(-1);
        }
        return ans.stream().mapToInt(Integer :: intValue).toArray();
        
        
    }
}