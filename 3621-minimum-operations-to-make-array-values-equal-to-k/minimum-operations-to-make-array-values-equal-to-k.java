class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> d=new HashSet<>();
       for(int i:nums){
        if(i<k) return -1;
        if(i>k) d.add(i);
       }
       return d.size();
    }
}