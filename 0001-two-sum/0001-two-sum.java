class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int arr[] = new int[2];
        // arr[0] = arr[1] = -1;
        // int n = nums.length-1;
        // for(int i = 0; i <= n; i++){
        //     for(int j = i+1; j <= n; j++){
        //         if(nums[i] + nums[j] == target){
        //             arr[0] = i;
        //             arr[1] = j;
        //             return arr;
        //         }
        //     }
        // }
        // return arr;
        
        // USING HASHMAP 
        
        int ans[] = new int[2];
         ans[0] = ans[1] = -1;
         int n = nums.length-1;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <= n; i++){
            int arr = nums[i];
            int muchNeeded = target - arr;
            if(map.containsKey(muchNeeded)){
                ans[0] = map.get(muchNeeded);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
        
    }
}