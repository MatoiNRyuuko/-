package killLint;

public class MergeTwoLists2 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(Integer.MIN_VALUE);
        ListNode p1 = l1, p2 = l2, p3 = l;
        while(p1 != null && p2 != null) {
            if(p1.val < p2.val) {
                p3.next = p1;
                p1 = p1.next;
            }else if (p1.val > p2.val) {
                p3.next = p2;
                p2 = p2.next;
            }else {
                p3.next = p1;
                p1 = p1.next;
                p3 = p3.next;
                p3.next = p2;
                p2 = p2.next;
            }
            p3 = p3.next;
        }
        p3.next = (null == p1 ? p2 : p1);
        return l.next;
    }
}
