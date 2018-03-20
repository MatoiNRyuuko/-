package killLint;

import killoffer.ListNode;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if(head == null){
            return head;
        }
        if(head.next == null){
            return null;
        }
        ListNode newHead = new ListNode(0);
        ListNode p1 = new ListNode(0);
        ListNode p2 = new ListNode(0);
        ListNode pre = new ListNode(0);
        pre.next = head;
        p1 = head;
        p2 = head;
        newHead = pre;
        int sum = 0;
        while(p1!=null){
            sum++;
            p1 = p1.next;
        }
        while(p2!=null){
            if(sum == n){
                pre.next = p2.next;
                p2 = p2.next;
                sum--;
            }else{
                p2 = p2.next;
                pre = pre.next;
                sum--;
            }
            
        }
        return newHead.next;
	}
}
