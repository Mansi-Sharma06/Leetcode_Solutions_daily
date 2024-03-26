class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];   //Array for lookup
        
        //mark the eelements from nums in the lookup array
        for(int num : nums){
            if(num > 0 && num <= n){
                seen[num] = true;
            }
        }
        
        //iterate through integers 1 to n 
        // return smallest missing positive integer
        for(int i = 1; i <= n; i++){
            if(!seen[i]){
                return i;
            }
        }
        
        // if seen contains all elements from 1 to n
        // the smallest missing positive number is  n + 1
        return n + 1;
    }
}