class Solution {
    public int firstUniqChar(String s) {
        
        boolean flag = false;

        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    flag = true;
                    break;
                }
                else if(s.charAt(i)!=s.charAt(j)){
                    flag = false;
                }
            }
            if(flag==false) return i;
        }

        return -1;
    }
}