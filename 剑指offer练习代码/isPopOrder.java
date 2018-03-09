package killoffer;
import java.util.Stack;
public class isPopOrder {
	private Stack<Integer> stack1 = new Stack<Integer>();
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int popindex = 0; 
        for(int i = 0;i<pushA.length;i++){
        stack1.push(pushA[i]);
        while(!stack1.isEmpty()&&stack1.peek() == popA[popindex]){
                stack1.pop();
                popindex++;
            }
        }
        return stack1.isEmpty();
        
    }
}
