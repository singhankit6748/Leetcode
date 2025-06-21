class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        int size = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }

        int resultHeadIndex = size - (k % size);

        if (resultHeadIndex == 0 || resultHeadIndex == size)
            return head;

        temp.next = head;
        temp= head;

        for (int i = 1; i < resultHeadIndex; i++) {
            temp = temp.next;
        }

        ListNode resultNode = temp.next;
        temp.next = null;
        return resultNode;
    }
}