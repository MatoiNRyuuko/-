package killLint;

public class DeleteNodeO1 {
	public void deleteNode(ListNode node) {
        // write your code here
        if(node == null){
            return;
        }
        node.val = node.next.val;
        node.next= node.next.next;
    }
}
