class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= x){
                x = nums[i];
            }
            else if(nums[i] <= y){
                y = nums[i];
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}