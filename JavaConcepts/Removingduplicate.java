package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class Removingduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] str = {"1","2","3","2","3"};
			
			Map<String,String> mp = new HashMap<>();
			
			for(int i =0;i<str.length;i++) {
				
				mp.put(""+str[i],""+str[i]);
			}
			System.out.println(mp);
	}

}
