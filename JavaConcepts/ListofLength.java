package JavaConcepts;

import java.util.Arrays;
import java.util.List;

public class ListofLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nn = {1,2,3,45};
		String vv = "qwert";
		char[] sd = new char[nn.length];
		
		for(int i=0; i<nn.length;i++) {
			 nn[i] = sd[i];
		}
		List gh = Arrays.asList(nn);
		System.out.println(gh);
	}

	
}
