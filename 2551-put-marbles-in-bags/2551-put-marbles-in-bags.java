class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int pairs[] = new int[n-1];   // creating pairs 

        for(int i = 1; i < n; i++){
            pairs[i-1] = weights[i] + weights[i-1];  // adding cost of bags
        }
        Arrays.sort(pairs);   // sorting pairs for finding min max
        long min = 0;
        long max = 0;
        for(int i = 0; i < k-1; i++){
            min += pairs[i];           // adding min and max pairs 
            max += pairs[n-i-2];
        }
        return max - min;         // return diff of min max 
    }
}