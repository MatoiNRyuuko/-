package killLint;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        // write your code here
        if(s.length() == 0){
            return 0;
        }
        char [] trans = s.toCharArray();

        int p = 0;
        for(int i = trans.length-1;i>=0;i--){
            p++;
            if(trans[i] ==' '&&i!=s.length()-1){
                return p-1;
            }
            if(trans[i] ==' '&&i==s.length()-1){
                p=0;
            }
        }
        return p;
    }
}
