package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Varisbletoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		String[] b = {"abc","sssd"};
		System.out.println(a.length);
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<a.length;i++) {
			arr.add(a[i]);
		}
//		for(int ss : a) {
//			arr.add(ss);
//		}
		System.out.println(arr);
		List num  = Arrays.asList(b);
		System.out.println(num);
		arr.stream().forEach(System.out::println);
	}

}
