package killLint;

import killoffer.ListNode;

public class Reverse {
	public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null){
            return null;
        }
        ListNode p = new ListNode(0);
        ListNode pre = null;
        ListNode next = new ListNode(0);
        p = head;
        next = p.next;
        while(next!= null){
            p.next = pre;
            pre = p;
            p = next;
            next = next.next;
        }
        p.next = pre;
        return p;
    }
}
