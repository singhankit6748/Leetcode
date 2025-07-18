class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        PostOrder(root,list);
        return list;
    }
    public void PostOrder(Node root,List<Integer> list){
        if(root==null) return;
        for(Node child:root.children){
            PostOrder(child,list);
        }
        list.add(root.val);
    }
}