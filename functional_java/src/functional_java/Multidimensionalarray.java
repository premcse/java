package functional_java;

import java.util.Arrays;

public class Multidimensionalarray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sample[][] = {{2,4,6,8},{3,5,7}};
		for (int[] ele : sample) {
			System.out.print(Arrays.toString(ele));
		}
		System.out.println(sample[1][1]);
	}

}
