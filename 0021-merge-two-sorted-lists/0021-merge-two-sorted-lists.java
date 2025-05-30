class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to act as the start of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Iterate through both lists while both are non-empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If one of the lists is not empty, append the remaining elements
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list starting from the next of the dummy node
        return dummy.next;
    }
}
