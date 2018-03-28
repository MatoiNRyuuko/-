package killLint;

public class MaxSubArray {
	public int maxSubArray(int[] nums) {
        // write your code here
        int sum = 0,res = -999;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            if(sum>res){
                res = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return res;
    }
}
