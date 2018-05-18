package killLeet;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
	public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        char [] pure = s.toCharArray();
        int p = 0;
        List<Character> Alive = new ArrayList<Character>();
        for(int i = 0;i<pure.length;i++){
            if(pure[i] <='Z' && pure[i] >='A'){
                pure[i] += 32;
                Alive.add(pure[i]);
            }else if(pure[i] <= 'z' && pure[i] >='a'){
                Alive.add(pure[i]);
            }else if(Character.isDigit(pure[i])){
                Alive.add(pure[i]);
            }
        }
        if(Alive.size() == 0){
            return true;
        }
        int mid = Alive.size()/2 +1,length = Alive.size()-1;
        while(p < mid){
            if(Alive.get(p) != Alive.get(length-p)){
                return false;
            }
            p++;
        }
        return true;
    }
}
