public class Solution {
    public boolean isPowerOfTwo(int n) {

      // approach 1
    return n < 0 ? false : Integer.bitCount(n) == 1;
 

           // approach 2
       // if (n <= 0) {
        //     return false;
        // }
        // while (true) {
        //     if (n == 1) {
        //         return true;
        //     }
        //     if (n % 2 == 1) {
        //         return false;
        //     }
        //     n /= 2;
        // }
    }
}