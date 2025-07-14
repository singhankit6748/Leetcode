/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int num=0,count=1;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            count*=2;
        }
        count/=2;
        curr=head;
        while(curr!=null){
            num+=curr.val*count;
            count/=2;
            curr=curr.next;
        }
        return num;
    }
}