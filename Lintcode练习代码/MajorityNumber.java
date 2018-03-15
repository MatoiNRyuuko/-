package killLint;

import java.util.List;

public class MajorityNumber {
	public int majorityNumber(List<Integer> nums) {
        // write your code here
        int major = nums.get(0);
        int index = 1;
        for(int i = 1;i<nums.size();i++){
            if(major == nums.get(i)){
                index++;
            }
            if(major != nums.get(i)){
                index--;
                if(index<1){
                    index = 0;
                    major = nums.get(i);
                }
            }
        }
        return major;
    }
}
