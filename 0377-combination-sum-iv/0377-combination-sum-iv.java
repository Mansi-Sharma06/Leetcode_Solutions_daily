class Solution {
    int[] dp;
    public int combinationSum4(int[] nums, int target) {
        
        // bottom up approach
        
//         int [] dp = new int[target+1];
//         dp[0] =1;
//         for(int i =1; i<= target; i++){
//             for(int n : nums){
//                 if(i>=n){
//                     dp[i] += dp[i-n];
//                 }
//             }
//         }
//         return dp[target];
//     }
// }
        
        // top down approach
        
          dp = new int[target+1];
         Arrays.fill(dp, -1);
         dp[0] =1;
        
        helper(nums,target);
        return dp[target];
    }
    
    int helper(int[] nums, int target){
        
        if(dp[target]> -1){
            return dp[target];
        }
            
            int res =0;
            for(int i : nums){
                if(i<=target){
                    res += helper(nums, target-i);
                }
            }
            dp[target] = res;
            return dp[target];
        }
    }

        