package killLint;

public class MaxAndMin {
	public int[] maxAndMin(int[][] matrix) {
        // write your code here
        if(matrix.length == 0){
            return new int [0];
        }
        int min = matrix[0][0],max = matrix[0][0];
        int [] result = new int [2];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        result[0] = max;
        result[1] = min;
        return result;
    }
}
