 
import java.util.*;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        int index = 0;
        for (int num : less) nums[index++] = num;
        for (int num : equal) nums[index++] = num;
        for (int num : greater) nums[index++] = num;

        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(solution.pivotArray(nums1, 10))); 

        int[] nums2 = {-3,4,3,2};
        System.out.println(Arrays.toString(solution.pivotArray(nums2, 2))); 
    }
}
