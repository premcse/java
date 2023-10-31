package functional_java;

import java.util.List;

public class FourthClass {
	
	public void listexp(List<Integer> number) {
		number.stream().forEach(System.out::println);
		System.out.println(number);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourthClass f4 = new FourthClass();
		f4.listexp(List.of(1,3,4,4,4,45));
	}

}
