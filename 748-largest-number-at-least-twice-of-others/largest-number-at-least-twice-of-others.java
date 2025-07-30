class Solution {
    public int dominantIndex(int[] nums) {
        int largestindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[largestindex]){
                largestindex=i;

            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=largestindex && nums[largestindex]< 2*nums[i]){
                return -1;
            }
        }
        return largestindex ;
        
    }
}