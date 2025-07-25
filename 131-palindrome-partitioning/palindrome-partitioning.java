class Solution {
    public List<List<String>> partition(String s) {
        List<String> ll=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        partitioning(s,ll,ans);
        return ans;
    }
    public static void partitioning(String ques,List<String> ll,List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            if(isPalindrome(s)){
                ll.add(s);
                partitioning(ques.substring(i),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}