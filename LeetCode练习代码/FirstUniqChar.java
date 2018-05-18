package killLeet;

public class FirstUniqChar {
	public int firstUniqChar(String s) {
        char [] transc = s.toCharArray();
        if(transc.length == 0){
            return -1;
        }
        int [] abc = new int [26]; 
        for(int i =0;i<transc.length;i++){
            abc[transc[i] - 'a']++;
        }
        for(int j = 0;j<transc.length;j++){
            if(abc[transc[j] - 'a'] == 1){
                return j;
            }
        }
        return -1;
    }
}
