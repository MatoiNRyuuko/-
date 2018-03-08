package killoffer;
import java.util.Stack;
public class isPopOrder {
	/* 给两个数组，pushA是表示压入栈的顺序，popA表示出栈的顺序。
	 * 判断popA是pushA出栈顺序是否成立。
	 * 思路：用一个栈stack1。先将pushA的数据逐个压入栈stack1。
	 * 栈stack1的顶部数据peek()与popA中的数据比较。
	 * 这里说明下popindex是控制比较位置的变量，从popA的第一位popindex = 0比较。
	 * 如果相等，则栈 stack1进行pop操作。如果不相等，继续将pushA中的数据压入栈stack1中
	 * 到最后，pushA的数一定会全压进栈内。判断栈stack1是否为空就能判断popA是否为pushA的
	 * 出栈顺序。因为如果popA为出栈顺序，则在判断栈顶弹出这步，stack1会逐个弹出直到为空。
	 * 如果不为出栈顺序，则栈stack1弹不完，popindex!=popA.length-1。栈就不为空。
	 */
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
