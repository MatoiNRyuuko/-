package killLint;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
	public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        List<Integer> list = new ArrayList<Integer>();
        int a=0,b = 0;
        while(list.size()!=m+n){
            if(b==n){
                list.add(A[a]);
                a++;
            }
            else if(a==m){
                list.add(B[b]);
                b++;
            }
            else if(A[a]>B[b]){
                list.add(B[b]);
                b++;
            }
            else if(A[a]<=B[b]){
                list.add(A[a]);
                a++;
            }
        }
        for(int k =0;k<list.size();k++){
            A[k] = list.get(k);
        }
    }
}
