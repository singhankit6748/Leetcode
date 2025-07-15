class Solution {
    public int hammingDistance(int x, int y) {
        int difference = 0;
        while(x>0&&y>0) {
            int last1 = x & 1;
            int last2 = y & 1;
            if ((last1 ^ last2) == 1) {
                difference++;
            }
            x=x>>1;
            y=y>>1;
        }
        while(x>0){
         if((x&1)==1){
             difference++;
         }
        x= x>>1;
        }
        while(y>0){
            if((y&1)==1){
                difference++;
            }
            y=y>>1;
        }
      return difference;
    }
}