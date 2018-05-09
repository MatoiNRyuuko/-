package killLint;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> result = new ArrayList<String>();
        for(int i = 1;i<=n;i++){
            if(i%15 == 0){
                result.add("fizz buzz");
            }else if(i%3 == 0){
                 result.add("fizz");
            }else if(i % 5 ==0){
                result.add("buzz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
