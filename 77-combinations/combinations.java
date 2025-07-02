class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> li1 = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        possibleCombinations(li1,li,1,n,k);

        return li1;
    }


    public static void possibleCombinations(List<List<Integer>> li1,List<Integer> li,int currIndex,int n,int k){

            if(li.size() == k){
                li1.add(new ArrayList<>(li));
                return ;
            }

            for(int i=currIndex;i<=n;i++){
                li.add(i);
                possibleCombinations(li1,li,i+1,n,k);
                li.remove(li.size()-1);
            }
        
    }
}