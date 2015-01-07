/**
 * Created by panqiuhui on 2015/1/7.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = null;
        if (head == null) {
            return result;
        }
        result = new ListNode(head.val);
        ListNode tail = result;
        int currentVal = result.val;
        while (head.next != null) {
            ListNode next = head.next;
            if (next.val > currentVal) {
                ListNode node = new ListNode(next.val);
                tail.next = node;
                currentVal = node.val;
                tail = node;
            }
            head = next;
        }
        return result;
    }
}
