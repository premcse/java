package functional_java;

import java.util.Arrays;
import java.util.List;

public class EightClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> sss = List.of(1,2,3,4,4);
		int []s = {1,2,3};
		System.out.println(Arrays.toString(s));
		
		List<String> abc = List.of("sadasd","sadasdasd");
		for (Integer ele : sss) {
			System.out.println(ele);
		}
		
		int [][] ml = {{2,3,45},{4,5,67}};
		
		System.out.println(Arrays.toString(ml[0]));
		System.out.println(abc);
	}

}
