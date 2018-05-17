package killLeet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersect {
	public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0){
            int [] a = new int[0];
            return a;
        }
        List<Integer> tmplist = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1= 0,p2 = 0;
        while(p1<nums1.length && p2 < nums2.length){
            if(nums1[p1] == nums2[p2]){
                tmplist.add(nums1[p1]);
                p1++;
                p2++;
            }else if(nums1[p1] > nums2[p2]){
                p2++;
            }else
                p1++;
        }
        int [] result = new int[tmplist.size()];
        for(int j = 0;j<tmplist.size();j++){
            result[j] = tmplist.get(j);
        }
        return result;
    }
}
