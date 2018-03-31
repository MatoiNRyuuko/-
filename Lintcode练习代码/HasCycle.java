package killLint;

import killoffer.ListNode;

public class HasCycle {
	public boolean hasCycle(ListNode head) {
        // write your code here
        if(head == null||head.next == null){
            return false;
        }
        ListNode go = new ListNode(0);
        ListNode f = new ListNode(0);
        
        go = head;
        f = head;
        
        while(go!=null&&go.next!=null){
            go = go.next.next;
            f = f.next;
            if(go == f){
                return true;
            }
        }
        return false;
    }
}
