import java.util.*;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        
        return closestSum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.threeSumClosest(new int[]{-1, 2, 1, -4}, 1)); 
        System.out.println(sol.threeSumClosest(new int[]{0, 0, 0}, 1));       
    }
}
