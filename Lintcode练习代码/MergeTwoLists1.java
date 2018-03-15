package killLint;

import killoffer.ListNode;

public class MergeTwoLists1 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode p1,p2;
        ListNode submit = new ListNode(0);
        ListNode s = new ListNode(0);
        s = submit;
        p1 = l1;
        p2 = l2;
        if(l1 ==null){
            return l2;
        }
        if(l2== null){
            return l1;
        }
        while(p1!=null||p2!=null){
            if(p1 ==null){
            s.next = p2;
            return submit.next;
            }
            if(p2== null){
            s.next = p1;
            return submit.next;
            }
            if(p1.val < p2.val){
                s.next = p1;
                s = s.next;
                p1 = p1.next;
            }
            if(p1.val > p2.val){
                s.next = p2;
                s = s.next;
                p2 = p2.next;
            }
        }
        
    
        return submit.next;
        
    }
}
