class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount = 0;
        int i = 0;
        int result = 0;
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == 0)
                zerocount++;
        
        while(zerocount > k){
            if(nums[i] == 0)
                zerocount--;
            i++;
        }
        result = Math.max(result, j - i + 1);
        }
        return result;
        
    }
}