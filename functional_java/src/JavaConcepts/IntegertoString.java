package JavaConcepts;

import java.util.Arrays;

public class IntegertoString {

	public static void main(String[] args) {
		int[] ss = {1,2,3,4};
		char[] vb = {'p','r'};
		int sd = vb.length;
		String df = "";
		String[] df2 = new String[sd];
		
		
//		for(int i =0; i<ss.length;i++) {
//			df+= ss[i];
//		}
		//System.out.println(Arrays.toString(df2));
		
//		for(int i =0; i<df.length();i++) {
//			df2[i] = String.valueOf(ss[i]);
//		}
		
		for(int i =0; i<vb.length;i++) {
			df2[i] = String.valueOf(vb[i]);
		}
		System.out.println(Arrays.toString(df2));
		
				}
}
