package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ascendingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "fdsa";

		//char[] df = new char[ss.length()] ;
		
		List<String> vvv = new ArrayList<>();
		
		for(int i =0;i<ss.length();i++) {
			//df[i]=ss.charAt(i);
			vvv.add(""+ss.charAt(i));
		}
		
		//for(int i =0;i<df.length;i++) {
			//System.out.println(df[i]);
			//vvv.add(""+df[i]);
		//}
		
		List<String> gh = vvv;
		List nm = gh.stream().sorted().collect(Collectors.toList());
		
		String fg = String.join("", nm);
		System.out.println(fg);
	}

}
