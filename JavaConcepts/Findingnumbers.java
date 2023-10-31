package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Findingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		char myGrade = 'B';
		String s1 = "10011101";
		char[] number = s1.toCharArray();
		int[] ac = {1,2,3,4};
		//String[] num = myGrade.toString();
		
		int n1 = 0;
		int n2 = 0;
		
		// System.out.println(ac.length);
		 
		 for(int i=0; i<s1.length();i++) {
			 if(s1.charAt(i) == '0') {
				 n1++;
			 }else {
				 n2++;
			 }
		 }
		 
		 System.out.println(n1);

//		 
//		 for(int i=ac.length-1; i>=0;i--) {
//			 if(ac[i] == 1) {
//				 System.out.println("dcc");
//			 }else {
//				 System.out.println("34234");
//			 }
//		 }
		
		 
		
		
		
			}

}
