class Solution {
    public static int maxSum(int[] nums) {
        HashSet<Integer> mh = new HashSet<>();
        int max = Integer.MIN_VALUE, sum = 0;
        boolean hasPositive = false;
        ArrayList<Integer> l = new ArrayList<>();

        for (int i : nums) {
            max = Math.max(max, i);
            if (i >= 0) {
                l.add(i);
                hasPositive = true;
            }
        }

        if (!hasPositive) return max;
        int size = l.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = l.get(i);
        }

        for (int i = 0; i < size; i++) {
            sum = 0;
            mh.clear();
            for (int j = i; j < size; j++) {
                if (!mh.contains(arr[j])) sum += arr[j];
                max = Math.max(max, sum);
                mh.add(arr[j]);
            }
        }
        return max;
    }
}