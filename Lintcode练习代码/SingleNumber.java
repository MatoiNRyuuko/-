package killLint;

public class SingleNumber {
	public int singleNumber(int[] A) {
	      if(A.length ==0 ){
	          return 0;
	      }
	      int n = A[0];
	      for(int i = 1;i < A.length; i++){
	          n = n^ A[i];//����������ͬ���Ϊ0���κ������0�����Ϊ����
	      }
	      return n;
	    }
}
