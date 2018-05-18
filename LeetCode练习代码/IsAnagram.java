package killLeet;

public class IsAnagram {
	public boolean isAnagram(String s, String t) {
        
        int [] abc1 = new int[26];
        int [] abc2 = new int[26];
        char [] schar = s.toCharArray();
        char [] tchar = t.toCharArray();
        for(int i = 0;i<schar.length;i++){
            abc1[schar[i] - 'a']++;
        }
        for(int i = 0;i<tchar.length;i++){
            abc2[tchar[i] - 'a']++;
        }
        for(int i = 0;i<26;i++){
            if(abc1[i] != abc2[i]){
                return false;
            }
        }
        return true;
    }
}
