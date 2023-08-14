package JavaConcepts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Streamreverse {
	
	public static void demo3() {
		List<Integer> re = List.of(2,3,4,5);
		List<String> vbvb = List.of("dfsfsf","dfsfdsfsdf");
		vbvb.stream()
//		.filter(res->res%2 == 0).
		//.map((vbvb)->vbvb.toUpperCase())
		//.sorted()
		.forEach(System.out::println);
	}
	
	public static void demo2(ArrayList<String> numbers) {
		//System.out.println(numbers);
		
//		numbers.stream()
//		.filter(num->num == "4433001s")
//		.forEach(System.out::println);
		
	}
	
	public static void demo() {
		String asd = "1003344";
		String asds = "10033443";
		String asdd = "";
		char[] vc = asd.toCharArray();
		
		for(int i=asd.length()-1; 0<=i;i--) {
			asdd+=vc[i];
		}
		
		
		ArrayList<String> lst = new ArrayList<>();
		lst.add(asd);
		lst.add(asds);
		lst.add(asdd);
		//lst.reverse();
		
		//demo2(lst);
		System.out.println(vc[2]);
		
		
		//as.stream().forEach(System.out::Println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo3();
		
		String a = "qqq";
		String b = "qqq1";
		if(a.equals(b)) {
			System.out.print("xzc");
		}else {
			System.out.print("xzc1111");

		}

	}

}
