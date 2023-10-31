package JavaConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FunctionalInterfaceIMPL2 implements Functionalinterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceIMPL2 vl = new FunctionalInterfaceIMPL2();
		ArrayList<Integer> bn = new ArrayList<>();
		
		Functionalinterface fl = (b,c) -> {
			
			if(b%2 == 0) {
				System.out.println(b*b);
			}
		
		};
		
			
		int[] a = {1,2,3,4};
		for(int i=0;i<a.length;i++) {
			fl.demomethod(a[i],"a");	
		}
		
	}

	@Override
	public void demomethod(int a,String b) {
		// TODO Auto-generated method stub
		//System.out.println(a);
		//a.stream().filter();
		
	}


}
