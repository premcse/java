package JavaConcepts;

import java.util.ArrayList;

public class FunctinalinterfaceIMPL3 implements Functionalinterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		ArrayList<Integer> ay = new ArrayList<>();
		
		for(int i=0; i<a.length;i++) {
			ay.add(a[i]);
		}
		
		
		Functionalinterface2 cv = ()->{
			
			ay.stream().filter(as->as%2 == 0).map(as->as*3).forEach(System.out::println);
		};
		
		cv.demo();
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}

}
