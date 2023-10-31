package JavaConcepts;

import java.util.LinkedList;
import java.util.Queue;

public class Quenejava {
	
	//Quene ->First in first out
	public void quenemethod() {
		Queue<Integer> abc = new LinkedList();
		abc.offer(4);
		abc.add(3);
		abc.add(2);
		abc.add(1);
		System.out.println(abc);
		abc.remove();	
		System.out.println(abc);
		abc.add(10);
		System.out.println(abc);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quenejava asd = new Quenejava();
		asd.quenemethod();

	}

}
