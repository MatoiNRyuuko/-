package killLint;

import killoffer.ListNode;

public class SwapPairs {
	public ListNode swapPairs(ListNode head) {
        // write your code here
        ListNode pre = new ListNode(0);
        ListNode res = new ListNode(0);
        pre.next = head;
        res = pre;
        while(pre.next!=null&&pre.next.next!=null){
            ListNode s1 = pre.next;
            ListNode s2= pre.next.next;
            ListNode next = s2.next;
            
            s2.next = null;
            s1.next = next;
            s2.next = s1;
            
            pre.next = s2;
            pre = pre.next.next;
        }
        return res.next;
    }
}
