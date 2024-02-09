class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){  // traversing array from last as digit will be added to last
            if(digits[i] < 9){
                digits[i]++;   // if last digit less than 9 then simply increment by 1 
                return digits; 
            }
            digits[i] = 0; // if not less than 9 i.e 9 then it will become 10 so last digit 0 
        }
        int [] result = new int[digits.length + 1];  // new array for the result 
        result[0] = 1; 
        return result; 
    }
}