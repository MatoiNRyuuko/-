package killLint;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        // write your code here
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        if(strs[0] == ""){
            return "";
        }
        int p = 1;
        String s = strs[0];
        String j = null;
        while(s.length()>0){
            if(p > strs[0].length()){
                return strs[0].substring(0,p-1);
            }
            s = strs[0].substring(0,p);
            for(int i =0;i<strs.length;i++){
                if(p > strs[i].length()){
                     return strs[0].substring(0,p-1);
                }
                
                j = strs[i].substring(0,p);
                if(s.equals(j) == false){
                    return strs[0].substring(0,p-1);
                }

            }
            p++;
            
        }
        return "";
    }
}
