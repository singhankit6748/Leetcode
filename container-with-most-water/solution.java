 class Solution {
    public int maxArea(int[] height) {
        // 1. Initialize the maximum area to 0
        int maxArea = 0;

        // 2. Initialize the left pointer to the start of the array (index 0)
        int left = 0;

        // 3. Initialize the right pointer to the end of the array (last index)
        int right = height.length - 1;

        // 4. Loop as long as the left pointer is less than the right pointer
        while (left < right) {
            // 5. Calculate the area of the current container
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            //  - Math.min(height[left], height[right]) gets the height of the container (the shorter line)
            //  - (right - left) gets the width of the container

            // 6. Update maxArea if the current area is larger
            maxArea = Math.max(maxArea, currentArea);

            // 7. Move the pointer that points to the shorter line inward
            if (height[left] < height[right]) {
                // The left line is shorter, so move the left pointer to the right
                left++;
            } else {
                // The right line is shorter (or equal), so move the right pointer to the left
                right--;
            }
        }

        // 8. Return the maximum area found
        return maxArea;
    }
}
