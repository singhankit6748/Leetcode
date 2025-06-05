public class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, ops = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                ops++;
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
            }
        }

        for (int num : nums) {
            if (num == 0) return -1;
        }

        return ops;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {0, 1, 1, 1, 0, 0};
        System.out.println(sol.minOperations(nums1)); // Output: 3

        int[] nums2 = {0, 1, 1, 1};
        System.out.println(sol.minOperations(nums2)); // Output: -1
    }
}
