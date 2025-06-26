class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // \U0001f3af Dummy node for simpler head management
        ListNode current = dummy; // \U0001f4cd Pointer to track the current end of merged list

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // ⬅️ Append smaller value from list1
                list1 = list1.next;
            } else {
                current.next = list2; // ➡️ Append smaller value from list2
                list2 = list2.next;
            }
            current = current.next; // \U0001f3c3 Move to next in merged list
        }

        // \U0001f517 Attach any remaining nodes from either list
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next; // \U0001f680 Return head of merged list (after dummy)
    }
}
