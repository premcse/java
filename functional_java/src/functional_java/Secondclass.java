package functional_java;

import java.util.Arrays;

public class Secondclass extends Firstclass {

	public String demo() {
		return "dwfwf";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secondclass s2 = new Secondclass();
//		Firstclass f1 = new Firstclass();
//		f1.numbers(5);
		int ar[] = new int[15];
		 System.out.println(Arrays.toString(ar));
		 for (int a=1; a<ar.length;a++) {
			  if(a != 0) {
	            ar[a] = a;
			  }
		 }
//		 for (int ele : ar) {
//			System.out.print(ele);
//		 }
		 System.out.println(Arrays.toString(ar));
		//System.out.println(s2.demo());

	}

}
