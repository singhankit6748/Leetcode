class Solution {
    public ListNode insertionSortList(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while(curr != null){
            
            ListNode prev = dummy;
            ListNode next = curr.next; 

            
            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }

            
            curr.next = prev.next;
            prev.next = curr;

           
            curr = next;
        }

        return dummy.next;
    }
}

// TC: O(N^2), SC: O(1)

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