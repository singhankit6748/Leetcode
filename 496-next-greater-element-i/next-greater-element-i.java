class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ptr1, ptr2, cnt = 0;
        int [] ans = new int[nums1.length];
        int idx = 0;
        while(cnt != nums1.length) {
            ptr1 = nums1[cnt];
            int i = 0;

            while(i < nums2.length && ptr1 != nums2[i]) {
                i++;
            }
            boolean flag = false;
            for(int j = i+1; j < nums2.length; j++) {
                if(nums2[j] > ptr1) {
                    ans[idx] = nums2[j];
                    idx++;
                    flag = true;
                    break;
                }
            }
            if(flag == false) {
                ans[idx] = -1;
                idx++;
            }
            cnt++;
        }
        return ans;
    }
}