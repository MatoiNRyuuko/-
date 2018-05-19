package killLeet;

public class StrStr {
	public int strStr(String haystack, String needle) {
        char [] hay = haystack.toCharArray();
        char [] dle = needle.toCharArray();
        boolean get = true;
        if(needle.length() == 0 || haystack.equals(needle)){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        int p1 = 0,p2 = 0,pt = 0;
        int length = haystack.length() - needle.length();
        while(p1 <= length){
            if(hay[p1] == dle[0]){
                pt = p1;
                while(get){
                    if(hay[pt] != dle[p2]){
                        get = false;
                    }
                    pt++;
                    p2++;
                    if(p2 == dle.length && get){
                        return p1;
                    }
                }
            }
            get = true;
            p1++;
            p2 = 0;
        }
        return -1;
    }
}
