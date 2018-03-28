package killLint;

public class StrStr {
	 public int strStr(String source, String target) {
	        // write your code here
	        if(source ==""&&target==""){
	            return 0;
	        }
	        if(source == null||target ==null){
	            return -1;
	        }
	        char [] StringSource = source.toCharArray();
	        char [] StringTarget = target.toCharArray();
	        int sum = 0,p1 = -1;
	        for(int i = 0;i<StringSource.length;i++){
	            int p = i;
	            for(int j = 0;j<StringTarget.length;j++){
	                if(StringSource[p] == StringTarget[j]){
	                    p++;
	                    sum++;
	                }
	                else if(StringSource[p] != StringTarget[j]){
	                    break;
	                }
	                if(p>=StringSource.length){
	                    break;
	                }
	            }
	            if(sum == StringTarget.length){
	                p1 = i;
	                break;
	            }
	            sum = 0;
	        }
	        return p1;
	     }
}
