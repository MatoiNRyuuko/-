package killLint;

import java.util.Stack;

public class MinStack {
	public MinStack() {
        // do intialization if necessary
    }
    Stack<Integer> mainStack = new Stack<Integer>();
    Stack<Integer> helpStack = new Stack<Integer>();
    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        // write your code here
        mainStack.push(number);
        if(helpStack.isEmpty()){
            helpStack.push(number);
        }
        else if(helpStack.peek()>=number){
            helpStack.push(number);
        }
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        int helptop = helpStack.peek();
        int maintop = mainStack.pop();
        
        if(helptop == maintop){
            helpStack.pop();
        }
        return maintop;
    }

    /*
     * @return: An integer
     */
    public int min() {
        // write your code here
        int helptop = helpStack.peek();

        return helptop;
    }
}
