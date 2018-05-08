package killLintMedium;

import java.util.PriorityQueue;
import java.util.Queue;

public class Topk {
	public int[] topk(int[] nums, int k) {
        // write your code here
        Queue<Integer> PQ = new PriorityQueue<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(PQ.size()< k){
                PQ.offer(nums[i]);
            }else{
                if(nums[i] > PQ.peek()){
                    PQ.poll();
                    PQ.offer(nums[i]);
                }
            }
        }
        int [] result = new int [k]; 
        for(int j = k-1;j>=0;j--){
            result[j] = PQ.poll();
        }
        return result;
    }
}
