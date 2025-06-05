import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minimumIndex(List<Integer> nums) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int dominant = -1;
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) * 2 > nums.size()) {
                dominant = num;
            }
        }
        
        int totalCount = frequencyMap.get(dominant);
        int leftCount = 0;
        int minIndex = -1;
        
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == dominant) {
                leftCount++;
            }
            int rightCount = totalCount - leftCount;
            
            if (leftCount * 2 > (i + 1) && rightCount * 2 > (nums.size() - i - 1)) {
                minIndex = i;
                break;
            }
        }
        
        return minIndex;
    }
}
