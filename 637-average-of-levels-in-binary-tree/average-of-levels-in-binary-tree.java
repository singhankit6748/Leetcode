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
 import java.math.BigDecimal;
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            BigDecimal sum=BigDecimal.ZERO;
            for(int i=0;i<size;i++)
            {
                TreeNode currentNode = q.poll();
                sum=sum.add(BigDecimal.valueOf(currentNode.val));
                if(currentNode.left!=null)
                {
                    q.offer(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    q.offer(currentNode.right);
                }
            }
            sum=sum.setScale(5);
            ans.add(sum.doubleValue()/size);
        }
        return ans;
    }
}