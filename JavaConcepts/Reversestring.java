package JavaConcepts;

import java.util.ArrayList;
import java.util.List;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "1000333";
		String vb = "";
		//char[] ch = abc.toCharArray();
		
		int as = abc.length()-1;
		//System.out.println(abc.charAt(0));
		//System.out.println(ch.length);

		for(int i=as; 0<=i;i--) {
			//if(i != 4) {
			vb+= abc.charAt(i);
			//}
			//System.out.println(ch[i]);
		}
		System.out.println(vb);
	}

}
