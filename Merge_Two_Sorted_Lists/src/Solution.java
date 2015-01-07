/**
 * Created by panqiuhui on 2015/1/7.
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head;
        ListNode cur;
        head = cur = l1.val < l2.val ? l1 : l2;
        ListNode p = l1;
        ListNode q = l2;
        if (l1.val < l2.val) {
            p = p.next;
        } else {
            q = q.next;
        }

        while (p != null && q != null) {
            if (p.val < q.val) {
                cur.next = p;
                cur = p;
                p = p.next;
            } else {
                cur.next = q;
                cur = q;
                q = q.next;
            }
        }
        if (p != null) {
            cur.next = p;
        }
        if (q != null) {
            cur.next = q;
        }
        return head;
    }
}
