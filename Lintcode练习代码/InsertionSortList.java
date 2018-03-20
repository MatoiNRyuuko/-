package killLint;

import killoffer.ListNode;

public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
        // write your code here
        ListNode Tnode = new ListNode(0);
        ListNode p = new ListNode(0);
        int tmp = 0;
        Tnode = head.next;
        p = head;
        
        while(Tnode!=null){
            while(p!=Tnode){
                    if(p.val>Tnode.val){
                        tmp = p.val;
                        p.val = Tnode.val;
                        Tnode.val = tmp;
                    }
                    p = p.next;
                }
            p = head;
            Tnode = Tnode.next;
        }
        return head;
    }
}
