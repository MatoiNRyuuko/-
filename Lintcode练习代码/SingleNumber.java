package killLint;

public class SingleNumber {
	public int singleNumber(int[] A) {
	      if(A.length ==0 ){
	          return 0;
	      }
	      int n = A[0];
	      for(int i = 1;i < A.length; i++){
	          n = n^ A[i];//异或操作，相同结果为0，任何数异或0结果都为该数
	      }
	      return n;
	    }
}
