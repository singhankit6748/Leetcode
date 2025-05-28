class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newNode = new ListNode(0, head);
        ListNode curr = newNode.next;
        ListNode prev = newNode;

        while (curr != null && curr.next != null) {
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = curr;
            prev.next = nextNode;

            prev = curr;
            curr = curr.next;
        }
        return newNode.next;
    }
}
