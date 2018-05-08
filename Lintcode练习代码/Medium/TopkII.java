package killLintMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopkII {
	Queue<Integer> TakeMeToTheTop  = new PriorityQueue<Integer>();
    int newK;
    public void Solution(int k) {
        // do intialization if necessary
        newK = k;
    }
    /*
     * @param num: Number to be added
     * @return: nothing
     */
    public void add(int num) {
        // write your code here
        if(TakeMeToTheTop.size() < newK){
            TakeMeToTheTop.offer(num);
        }
        else{
            if(num > TakeMeToTheTop.peek()){
                TakeMeToTheTop.poll();
                TakeMeToTheTop.offer(num);
            }
        }
    }
    /*
     * @return: Top k element
     */
    public List<Integer> topk() {
        // write your code here'
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> tmp = new ArrayList<Integer>();
        while(TakeMeToTheTop.size()!=0){
            tmp.add(TakeMeToTheTop.poll());
        }
        for(int j =  tmp.size()-1;j >= 0;j--){
            result.add(tmp.get(j));
        }
        for(int i = 0;i<result.size();i++){
            TakeMeToTheTop.offer(result.get(i));
        }
        return result;
    }
}
