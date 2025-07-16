class Solution {
    public boolean checkPerfectNumber(int num) {
        int x = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                x += i;
            }
        }
        return (num == x) ? true : false;
    }
}