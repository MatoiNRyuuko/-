package killLint;

import killoffer.ListNode;

public class GetIntersectionNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // write your code here
        if(headA == null || headB ==null){
            return null;
        }
        ListNode pa = new ListNode(0);
        ListNode pb = new ListNode(0);
        
        pa = headA;
        pb = headB;
        
        int Alength = getLength(headA);
        int Blength = getLength(headB);
        if(Alength >Blength){
            while(Alength != Blength){
                pa = pa.next;
                Alength --;
            }
        }
        if(Alength < Blength){
            while(Alength != Blength){
                pb = pb.next;
                Blength --;
            }
        }
        if(Alength == Blength){
            if(pa == pb){
                    return pa;
                }
            while(pa != pb){
                
                pa = pa.next;
                pb = pb.next;
                if(pa == pb){
                    return pa;
                }
            }
        }
        return null;
        
    }
    public int getLength(ListNode listnode){
        ListNode p  = listnode;
        int length = 1;
        while(p!= null){
            length++;
            p = p.next;
        }
        return length;
    }
}
