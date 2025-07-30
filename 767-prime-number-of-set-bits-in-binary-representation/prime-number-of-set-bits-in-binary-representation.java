class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int bits = countBits(i);
            if (isPrime(bits)) {
                result++;
            }
        }
        return result;
    }

    // Brian Kernighan's algorithm to count set bits
    public int countBits(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;
    }

    // Function to check if a number is prime
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}