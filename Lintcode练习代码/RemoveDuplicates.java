package killLint;

public class RemoveDuplicates {
	// write your code here
	public int removeDuplicates(int[] nums) {
        // write your code here
        int size = 0;
        if(nums == null|| nums.length ==0){
            return 0;
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i] != nums[size]){
                size++;
                nums[size] = nums[i];
            }
        }
        return size+1;
    }
}
