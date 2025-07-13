class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> list = new HashSet<>();
        for(int i : nums1)
            set.add(i);
        
        for(int i: nums2){
            if(set.contains(i)){
                list.add(i);
            }
        }

        int[] ans = new int[list.size()];
        int index = 0;
        for(Integer i: list){
            ans[index] = i;
            index++;
        }

        return ans;
        
    }
}