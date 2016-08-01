package algorithm;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {

	public static void main(String [] args){
		List <int []> matrix = new ArrayList <int []>();
		int [] ele1 = {1, 5, 9 };
		int [] ele2 = {10, 11, 13};
		int [] ele3 = {12, 13, 15};
		matrix.add(ele1);
		matrix.add(ele2);
		matrix.add(ele3);
		int kth = solution(matrix, 8);
		System.out.println("The Kth one is:" + kth);
	}
	
	public static int solution(List<int []> matrix, int k){
		int width = matrix.size();
		assert 1 <= k && k <= width * width: "The k must be in 1 and width * width";
		
		
		return 0;
	}
}
