package JavaConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> abc  = new LinkedList<String>();
		abc.add("prem");
		abc.add("selvi");
		abc.add("ravi");
		abc.add("swapna");
		System.out.println(abc);
		
		Iterator it = abc.iterator();
		
		for(String sts : abc) {
			System.out.println(sts);
		}

	}

}
