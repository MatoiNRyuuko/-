package killoffer;
import java.util.ArrayList;
import java.util.Stack;

public class InvertPrintLink {
		
	    private ArrayList<Integer> list = new ArrayList<Integer>();
	    private Stack<Integer> stack1 = new Stack<Integer>();
	    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        while(listNode!=null){
	        stack1.push(listNode.val);
	        listNode = listNode.next;
	        }
	        while(!stack1.isEmpty()){
	            list.add(stack1.pop());
	        }
	        
	        return list;
	    }
	
}
