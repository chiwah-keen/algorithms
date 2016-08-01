package algorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args){
		int [] preSort = {1,2,3,4,2,3,4,5,6,78,5};
		System.out.println(Arrays.toString(preSort));
		int round = bSort(preSort);
		System.out.println(Arrays.toString(preSort));
		System.out.println("Total Round:" + round);
	}
	
	public static int bSort(int[] preSort){
		boolean hasMoved = true;
		int round = 0;
		int i = 0;
		while(hasMoved == true && i < preSort.length){
			hasMoved = false;
			for(int j=0; j < preSort.length - 1; j ++){
				if(preSort[j] > preSort[j + 1]){
					Integer m = null;
					m = preSort[j];
					preSort[j] = preSort[j + 1];
					preSort[j + 1] = m;
					hasMoved = true;
					round ++;
				}
			}
		}
		return round;
	}
	
	
}
