package killLint;

public class SearchInsert {
	public int searchInsert(int[] A, int target) {
        // write your code here
        int head = 0,last = A.length-1,res= 0;
        if(A.length == 0||A.length ==1){
            return 0;
        }
        if(target>A[last]){
            return last+1;
        }
        if(target<A[head]){
            return head;
        }
        
        while(true){
            int mid = (head + last) /2;
            int right = 0;
            if(mid != A.length -1 ){
                right = A[mid+1];
            }else{
                return mid;
            }
            if(A[mid] == target){
                res = mid;
                break;
            }
            else if(target>A[mid] && target < right){
                res = mid +1;
                break;
            }else if(target<A[mid]){
                last = mid-1;
            }else if(target>=right){
                head = mid+1;
            }
        }
        return res;
    }
}
