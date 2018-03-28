package killLint;

public class IsHappy {
	public boolean isHappy(int n) {
        // write your code here
        while(true){
            n = HappybuHappy(n);
            if(n==4){
                break;
            }
            if(n ==1){
                return true;
            }
        }
        return false;
    }
    int HappybuHappy(int sum){
        int res = 0,tmp = 0;
        while(sum != 0){
            tmp = sum%10;
            res += tmp * tmp;
            sum = sum/10;
        }
        return res;
    }
}
