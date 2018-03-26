package killLint;

public class BinarySearch {
	public int binarySearch(int[] nums, int target) {
        // write your code here
        int mid =0,lo =0,hi = nums.length -1,res = 999;
        while(lo<=hi){
            mid = (lo+hi)/2;
            if(nums[mid] == target){
                res = mid;
                hi = mid -1;
            }else if(nums[mid] < target){
                lo = mid+1;
            }else if(nums[mid] > target){
                hi = mid-1;
            }
        }
        if(res != 999){
            return res;
        }else{
            return -1;
        }
    }
}
