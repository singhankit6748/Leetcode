class Solution {
    public String licenseKeyFormatting(String s, int k) {
        List<String>list = new ArrayList();
        int temp =0;
        String str="";
        for(int i=s.length()-1;i>-1;i--){
          if(s.charAt(i)!='-'){
            str+=s.charAt(i)+"";
            temp++;
          }
          if(temp==k){
            list.add(str);
            str="";
            temp=0;
          }
        }
        if(!str.equals(""))
           list.add(str);
        s="";
        for (int i = list.size() - 1; i >= 0; i--) { 
            s += new StringBuilder(list.get(i)).reverse().toString();
            if (i != 0) s += "-";
         }
        return s.toUpperCase();
    }
}