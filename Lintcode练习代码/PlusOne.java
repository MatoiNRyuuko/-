package killLint;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        // write your code here
        for(int i =digits.length-1;i>=0;i--){
            digits[i] += 1;
            if(digits[i] == 10){
                digits[i] = 0;
                if(i==0){
                    int [] array = new int [digits.length+1];
                    for(int j =0;j<digits.length+1;j++){
                        if(j==0){
                            array[j] = 1;
                        }
                        else{
                            array[j] = 0;
                        }
                    }
                    return array;
                }
            }
            else{
                break;
            }
        }
        return digits;
    }
}
