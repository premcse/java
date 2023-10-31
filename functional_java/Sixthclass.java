package functional_java;

import java.util.List;
import java.util.stream.Stream;

public class Sixthclass {
	
	public static void print(int num) {
//		String dd = Integer.toString(num);
//		char[] ch = dd.toCharArray();
		
		System.out.println(num);
		
	}
	
	public static boolean print2(int num) {
		return num%2 == 0;
		
	}
	
	public static void demofun(List<Integer> number) {
//		for (int ele : number) {
//			System.out.println(ele);
//		}
		number.stream()
//		.filter(Sixthclass::print2)
		
//		or
		.filter(numbers -> numbers%2 == 0)
		.forEach(Sixthclass::print);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sixthclass f6 = new Sixthclass();
		f6.demofun(List.of(2,3,4,5,6,7,8));

	}

}
