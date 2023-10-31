package JavaConcepts;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class QueneHashmapTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> abc = new LinkedList<>();
		
		abc.add(4);
		abc.add(6);
		abc.add(2);
		abc.add(2);
		abc.add(1);
		abc.remove();
		//Iterator<Integer> itl = abc.iterator();
		//while(itl.hasNext()) {
			System.out.println(abc);
		//}
		
		
		Map<String, Integer> ac = new HashMap<>();
		//It result in ascending order and removes duplicate
		ac.put("a", 1);
		ac.put("b", 2);
		ac.put("d", 3);
		ac.put("c", 4);
		ac.put("c", 5);
		System.out.println(ac.values());
		System.out.println(ac.keySet());
		ac.remove("c");
		System.out.println(ac);
		
		Set<Integer> bc = new TreeSet<>();
		bc.add(2);
		bc.add(6);
		bc.add(4);
		bc.add(8);
		bc.add(8);
		//bc.remove(6);
		System.out.println(bc);
		
		Set<Integer> bc2 = new HashSet<>();
		bc2.add(2);
		bc2.add(6);
		bc2.add(4);
		bc2.add(8);
		bc2.add(8);
		//bc.remove(6);
		System.out.println(bc2);
		
		Map<String,Integer> bcd = new TreeMap<>();
		bcd.put("a",2);
		bcd.put("b",4);
		bcd.put("d",8);
		bcd.put("d",10);
		bcd.put("c",3);

		//bcd.remove("c");
		System.out.println(bcd);

		
	}

}
