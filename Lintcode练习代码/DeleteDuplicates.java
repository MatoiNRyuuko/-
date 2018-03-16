package killLint;

import killoffer.ListNode;

public class DeleteDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        ListNode p = new ListNode(0);
        ListNode pNext = new ListNode(0);
        if(head == null){
            return null;
        }
        p = head;
        pNext = head.next;
        while(pNext != null){
            if(head.val == pNext.val){
                head.next = pNext.next;
                pNext = pNext.next;
            }
            else{
                head= head.next;
                pNext = pNext.next;
            }
        }
        return p;
    }
}
