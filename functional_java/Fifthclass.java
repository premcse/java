package functional_java;
import java.util.ArrayList;

public class Fifthclass {
	public static void printlist() {
		ArrayList<Integer> car = new ArrayList<Integer>();
		
		for(int i=0;i<=10;i++) {
			car.add(i);
		}
		System.out.println(car);
		
		
	}
	
	public static void main(String[] args) {
		Fifthclass f5 = new Fifthclass();
		f5.printlist();
	}

}
