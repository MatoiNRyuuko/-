package killLint;

public class Sqrt {
	public int sqrt(int x) {
        // write your code here
        int res = 1,sq = 0,sub = 0;
        if(x == 0){
            return 0;
        }
        while(true){
            sq = res*res;
            sub = x -sq;
            if(sq == x){
                break;
            }
            if(sub< 0){
                return res-1;
            }
            res++;
        }
        return res;
    }
}
