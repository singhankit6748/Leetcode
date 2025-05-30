/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        //edge case
        if(root == null){
            return root;
        }
        Node leftmost = root;
        Node curr = root;
        while(leftmost.left!=null){
            curr.left.next = curr.right;
            if(curr.next!=null){
                curr.right.next = curr.next.left;
                curr = curr.next;
            }else{
                leftmost = leftmost.left;
                curr = leftmost;
            }
        }
        return root;
    }
}
