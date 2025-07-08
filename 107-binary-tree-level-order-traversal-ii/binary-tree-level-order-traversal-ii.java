/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer>curr=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode node=q.remove();
            if(node==null){
                ans.add(new ArrayList<>(curr));
                curr.clear();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
                
            }
            else{
                curr.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}