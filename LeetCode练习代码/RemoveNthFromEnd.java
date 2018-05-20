package killLeet;

import java.util.LinkedList;
import java.util.Queue;

import killoffer.ListNode;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEndI(ListNode head, int n) {
        Queue<Integer> queue = new LinkedList<Integer>();
        ListNode p  = head;
        ListNode tmp = new ListNode(0);
        ListNode result = tmp;
        int time = 0,length = 0;
        while(p!=null){
            queue.offer(p.val);
            p = p.next;
            length++;
        }
        while(!queue.isEmpty()){
            if(time != length - n){
                tmp.next = new ListNode(queue.poll());
                tmp = tmp.next;
            }
            else {
                queue.poll();
            }
            time++;
        }
        return result.next;
    }
	public ListNode removeNthFromEndII(ListNode head, int n) {
        ListNode pre = head;
        ListNode cur = head;
        for(int i = 0;i<n;i++){
            cur = cur.next;
        }
        if(cur== null){
            return head.next;
        }
        while(cur.next != null){
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
