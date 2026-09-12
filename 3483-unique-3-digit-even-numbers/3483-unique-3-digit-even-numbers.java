class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        int n = digits.length;

        // Convert array to a frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int digit : digits) {
            freqMap.put(digit, freqMap.getOrDefault(digit, 0) + 1);
        }

        // Generate all possible 3-digit numbers
        for (int i = 0; i < n; i++) {  // First digit
            if (digits[i] == 0) continue; // No leading zero

            for (int j = 0; j < n; j++) { // Second digit
                if (j == i) continue; 

                for (int k = 0; k < n; k++) { // Third digit
                    if (k == i || k == j) continue;
                    if (digits[k] % 2 != 0) continue; // Must be even

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    uniqueNumbers.add(num);
                }
            }
        }

        return uniqueNumbers.size();
    }
}