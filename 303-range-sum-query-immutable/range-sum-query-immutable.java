class NumArray {
    private int[]prefixsum;
    public NumArray(int[] nums) {
        prefixsum = new int[nums.length];
        prefixsum[0] = nums[0];
        for(int i =1;i<nums.length;i++){
            prefixsum[i]= nums[i]+prefixsum[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return prefixsum[right];
        }
        return prefixsum[right]-prefixsum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */