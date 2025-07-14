class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res=new ArrayList<>();
        gen(res,turnedOn,0,0,0,0);
        return res;
    }
    public void gen(List<String> res,int turnedOn,int idx,int hour,int min,int count){
        if(hour>11 || min>59) return;

        if(count==turnedOn){
            res.add(hour+":"+((min<10)?("0"+min):min));
            return;
        }

        if (idx == 10) return;

        if(idx<4){
            gen(res,turnedOn,idx+1,hour+(1<<idx),min,count+1);
        }else{
            gen(res,turnedOn,idx+1,hour,min+(1<<(idx-4)),count+1);
        }

        gen(res,turnedOn,idx+1,hour,min,count);
    }
}