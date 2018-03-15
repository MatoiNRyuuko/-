package killLint;

public class Fibonacci {
	public int fibonacci(int n) {
        int a= 0,b= 1,sum = 0;
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        for(int i = 0;i<n-2;i++){
            sum = a + b;
            a = b;
            b = sum;
           
        }
        return sum;
    }
}
