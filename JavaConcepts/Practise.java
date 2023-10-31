package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] abc = {"1","2","3","2"};
//		String a = "";
//		
//		for(int i =0;i<abc.length;i++) {
//			a +=abc[i];
//		}
//		System.out.println(a);
//		
//		Set<String> ss = new HashSet<>();
//		
//		for(int i = 0; i<abc.length;i++) {
//			ss.add(""+abc[i]);
//		}
//		
//		System.out.println(ss);
//		-------------------------------------------------------------
//		int[] ss = {1,2,3,4};
//		char[] vb = {'p','r'};
//		String[] st = new String[6];
//		
//		ArrayList<String> sss = new ArrayList<>();
//		
//		
//		
//		for(int i=0;i<ss.length;i++) {
//			sss.add(""+ss[i]);
//		}
//		
//		for(int i=0;i<vb.length;i++) {
//			sss.add(""+vb[i]);
//		}
//		
//		System.out.println(sss);
//		System.out.println(sss.size());
//		System.out.println(sss.get(1));
//		
//
//		for(int i=0;i<sss.size();i++) {
//			st[i] = sss.get(i);
//		}
//		
//		System.out.println(Arrays.toString(st));
//		---------------------------------
		ArrayList<Integer> set = new ArrayList<>();
		 

	        set.add(10);
	        set.add(20);
	        set.add(20);
	        set.add(10);
	        set.add(50);
	        set.add(40);
	        
	       
	       Set<Integer> sss = new HashSet<>(set);
//	        // Print the first item
//	      
//	        Iterator<Integer> it = set.iterator();
//	        while(it.hasNext()) {
//	        	  System.out.println(it.next());
//	        	}
//        System.out.println(set.get(0));
//	        List<Integer> unsortedList = Arrays.asList(10,1,21,3,6,2);
//	        
//	     // Sorting in descending order
//			List<Integer> sortedListDesc = 
//					unsortedList.stream()
//				.sorted(Comparator.reverseOrder())
//				//.forEach(System.out::println);
//				.collect(Collectors.toList());
//			System.out.println(sortedListDesc);
//			System.out.println(" ");
//			
//			//filter by 2
//			
//			unsortedList.stream().filter(as->as%2 == 0).sorted().forEach(System.out::println);
//				
//	        
	       List<Integer> arr = new ArrayList<>(set);
	       System.out.println(sss);
	        
	        	
	        
		

	}

}
