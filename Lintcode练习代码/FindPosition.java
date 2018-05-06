package killLint;

public class FindPosition {
	public int findPosition(int[] nums, int target) {
        // write your code here
        if(nums.length == 0){
            return -1;
        }
        int high = nums.length-1,low = 0;
        int mid = -1;
        while(low != high){
            mid = (high+low)/2;
            if(nums[mid] > target){
                high = mid -1;
            }else if(nums[mid] < target){
                low = mid +1;
            }else{
                return mid;
            }
            if(nums[low] > target || nums[high] < target){
                return -1;
            }
        }
        return -1;
    }
}
