 public class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0, maxLen = 0, bitMask = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((bitMask & nums[right]) != 0) {
                bitMask ^= nums[left];
                left++;
            }

            bitMask |= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 3, 8, 48, 10};
        System.out.println(sol.longestNiceSubarray(nums1)); 

        int[] nums2 = {3, 1, 5, 11, 13};
        System.out.println(sol.longestNiceSubarray(nums2)); 
    }
}

