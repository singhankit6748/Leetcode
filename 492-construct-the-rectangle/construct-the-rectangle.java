class Solution {
    public int[] constructRectangle(int area) {
        int w=(int)Math.sqrt(area);
        while(area%w!=0)
        {
            w--;
        }
        int h=area/w;
        return (new int[] {h,w});
        
    }
}