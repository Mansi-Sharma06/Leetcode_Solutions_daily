import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // HashSet to store unique XOR results
        Set<Integer> uniqueXorResults = new HashSet<>();
        
        int n = nums.length;
        
        // Store XOR of pairs
        Set<Integer> pairXorResults = new HashSet<>();
        
        // Step 1: Calculate XOR for all pairs (i, j) where i <= j
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int xorPair = nums[i] ^ nums[j];
                pairXorResults.add(xorPair);
            }
        }

        // Step 2: Combine each pair's XOR with nums[k] to form a triplet
        for (int pairXor : pairXorResults) {
            for (int k = 0; k < n; k++) {
                uniqueXorResults.add(pairXor ^ nums[k]);
            }
        }

        // Return the number of unique XOR triplet values
        return uniqueXorResults.size();
    }
}
