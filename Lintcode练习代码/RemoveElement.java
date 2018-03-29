package killLint;

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        // write your code here
        if(A == null){
            return 0;
        }
        int p=0;
        for(int i =0;i<A.length;i++){
            if(A[i] != elem){
                A[p] = A[i];
                p++;
            }
        }
        return p;
    }
}
