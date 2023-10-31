package JavaConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class ArraytoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We cant save array into arraylist
		int[] a = {1,2,3,4,5};
		String na = "aaasss";
		List<String> vbvb = List.of("dfsfsf","dfsfdsfsdf");
		
		List<String> itt = List.of("eeee","qqqqq","yyyy");
		List<String> numm = itt.stream().sorted().collect(Collectors.toList());
		
		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Bear");
		animals.push("Lion");
		
		System.out.println(numm);
		
		ArrayList<String> ar = new ArrayList<>(numm);
		Set<String> ar2 = new HashSet<>(ar);
		ar2.add("deer");
		
		System.out.println(animals);
		System.out.println(ar);
		System.out.println(ar2);
	}

}
