class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int i = 0, j = 0, len = timeSeries.length, count = 0;

        for(i = 0; i < len-1; i++) {
            if((timeSeries[i+1] - timeSeries[i]) >= duration) count+=duration;
            else count+=(timeSeries[i+1] - timeSeries[i]);
        }
        count+=duration;
        return count;
    }
}