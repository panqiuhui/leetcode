/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersectionNode = null;
        int lenA = 0;
        int lenB = 0;

        ListNode pA = headA;
        while (pA != null) {
            pA = pA.next;
            lenA++;
        }
        ListNode pB = headB;
        while (pB != null) {
            pB = pB.next;
            lenB++;
        }
        boolean isALonger = (lenA - lenB) > 0;
        int diff = isALonger ? lenA - lenB : lenB - lenA;
        pA = headA;
        pB = headB;
        if (isALonger) {
            while (diff != 0) {
                pA = pA.next;
                diff--;
            }
        } else {
            while (diff != 0) {
                pB = pB.next;
                diff--;
            }
        }
        while (pA != null && pB != null) {
            if (pA.val == pB.val) {
                intersectionNode = pA;
                break;
            }
            pA = pA.next;
            pB = pB.next;
        }
        return intersectionNode;
    }

}
