package killlakill;

import java.util.Arrays;

public class InsertSort {
	public static void insertSort(int [] arr) {
		int i,j,tmp;
		for(i = 1;i<arr.length;i++) {
			tmp = arr[i];
			j = i - 1;
			while(j>=0 &&arr[j]>tmp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[++j] = tmp;
			
		}
	}
	public static void main(String[] args) {
		int a[] = { 20,22,1,5,9,15,6,50,18 };
		insertSort(a);
		System.out.println(Arrays.toString(a));
	}
}
