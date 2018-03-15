package killLint;

public class TwoSumTarget {

	public int[] twoSum(int[] numbers, int target) {
        // write your code here
       
        int first,second;
        int sum = 0 ;
        int [] elementPosition = new int[2];
        if(numbers.length == 2){
            elementPosition[0] = 0;
            elementPosition[1] = 1;
            return elementPosition;
        }
        for(first=0;first<numbers.length;first++){
            for(second=1;second<numbers.length;second++){
                sum = numbers[first] + numbers[second];
                if(sum == target){
                    elementPosition[0] = first;
                    elementPosition[1] = second;
                    
                     return elementPosition;
                }
            }
        }
        return elementPosition;
    }
}
