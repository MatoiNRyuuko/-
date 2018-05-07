package killLint;

public class Compress {
	public String compress(String str) {
        // write your code here
        if(str.length() == 0){
            return str;
        }
        int repeat = 0;
        char [] ch = str.toCharArray();
        String result = "";
        char tmp = ch[0];
        for(int i=0;i<ch.length;i++){
            if(tmp == ch[i])
                repeat++;
            else{
                result += String.valueOf(ch[i-1]);
                result += repeat + "";
                tmp = ch[i];
                repeat = 1;
            }
            if( i == ch.length-1){
                result += String.valueOf(ch[i]);
                result += repeat + "";
            }
        }
        return result.length() < str.length() ? result : str;
    }
}
