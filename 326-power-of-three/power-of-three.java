class Solution {
    public boolean isPowerOfThree(int n) {
        // If n is less than or equal to 0, it's not a power of 3
        if (n <= 0) return false;
        
        // Repeatedly divide n by 3
        while (n % 3 == 0) {
            n /= 3;
        }
        
        // If n is reduced to 1, it is a power of 3
        return n == 1;
    }
}
