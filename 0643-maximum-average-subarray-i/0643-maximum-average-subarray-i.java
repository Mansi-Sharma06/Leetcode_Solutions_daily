class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        // calculating sum of subarray
        for(int i = 0; i< k; i++){
            sum += nums[i];          
        }
            // define maxsum
            double maxSum = sum;
            
        // for sliding window
            int startIndex = 0;
            int endIndex = k;
            
            while(endIndex < nums.length){
                // remove previous element 
                sum -= nums[startIndex];
                startIndex++;
                
                // add next element
                sum += nums[endIndex];
                endIndex++;
                
                // calculate max sum 
                maxSum = Math.max(maxSum, sum);
                
            }
        // return result by / k
        return maxSum / k;
        
    }
}