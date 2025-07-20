class Solution {
    public boolean judgeCircle(String moves) {
        int[] freq = new int[26];
        for(char ch:moves.toCharArray()){
            freq[ch-'A']++;
        }
        if((freq['U'-'A']==freq['D'-'A']) && (freq['R'-'A']==freq['L'-'A'])) return true;
        return false;
    }
}