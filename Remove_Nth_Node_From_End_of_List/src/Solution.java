/**
 * Created by panqiuhui on 2014/12/5.
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firstP = head;
        ListNode secordP = head;
        for (int i = 0; i < n; i++) {
            if (firstP.next == null) {
                if (n == 1) {
                    return null;
                } else {
                    return head.next;
                }
            } else {
                firstP = firstP.next;
            }
        }
        while (firstP.next != null) {
            firstP = firstP.next;
            secordP = secordP.next;
        }
        secordP.next = secordP.next.next;
        return head;
    }
}
