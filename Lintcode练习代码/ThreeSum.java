package killLint;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        int first=0,second=1,third=2;
        int sum = 0;
        List<List<Integer>> result = new ArrayList();
        while(first != numbers.length-2){
            while(second != numbers.length-1){
                while(third <= numbers.length-1){
                    sum = numbers[first] + numbers[second] + numbers[third];
                    if(sum == 0){
                        List<Integer> sumList =
                        SortList(numbers[first],numbers[second],numbers[third]);
                        if(!result.contains(sumList))
                            result.add(sumList);
                    }
                    third++;
                }
                second++;
                third =  second + 1;
            }
            first++;
            second = first +1;
            third = second +1;
        }
        //result.remove(2);
        return result;
    }
    private List<Integer> SortList(int one,int two,int three){
        if(one > two){
            int tmp = two;
            two = one ;
            one = tmp;
        }
        if(two > three){
            int tmp = three;
            three = two;
            two = tmp;
        }
        if(one > two){
            int tmp = two;
            two = one ;
            one = tmp;
        }
        List<Integer> sumList = new ArrayList();
        sumList.add(one);
        sumList.add(two);
        sumList.add(three);
        return sumList;
    }
}
