package killLint;

public class SearchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix == null || matrix.length==0)
            return false;
        int c = 999;
        int i = 0;
        while(c == 999){
            if(i == matrix.length)
                return false;
            if(matrix[i][matrix[i].length-1] > target){
                c = i;
                break;
            }
            if(matrix[i][matrix[i].length-1] == target)
                return true;
            
            i++;
        }
        for(int j = 0;j<matrix[c].length;j++){
            if(matrix[c][j] == target){
                return true;
            }
        }
        return false;
    }
}
