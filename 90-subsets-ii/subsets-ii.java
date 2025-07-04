class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        Arrays.sort(nums);
        print(0,ll,ans,nums);
        return ans;
    }
    public static void print(int ind,List<Integer> ll,List<List<Integer>> ans,int[] nums){
        if(ind>=nums.length){
            ans.add(new ArrayList<>(ll)); 
            return;
        }
        ll.add(nums[ind]);
        print(ind+1,ll,ans,nums);
        ll.remove(ll.size()-1);
        while(ind+1<nums.length && nums[ind]==nums[ind+1]){
            ind++;
        }
        print(ind+1,ll,ans,nums);
    }
}