package killLint;

public class SpiralArray {
	public int[][] spiralArray(int n) {
        // write your code here
        int [][]  result = new int[n][n];
        int right = n-1,down = n-1,left = 0, up = 0,p = 0,whileint = 1;
        while(down>=up){
            p = left;
            while(p <= right){
                result[up][p++] = whileint++;
            }
            p = up+1;
            while(p<=down){
                result[p++][right] = whileint++;
            }
            p = right -1;
            while(p >= left){
                result[down][p--] = whileint++;
            }
            p = down - 1;
            while(p >up){
                result[p--][left] = whileint++;
            }
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }
}
