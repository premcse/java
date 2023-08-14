package JavaConcepts;

public class dummy {
	
	private static void demo() {
		String ss = "000111";
		String ss2 = "";
		int nn = 0;
		int nm2 = 0;
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i) == '0') {
				nn++;
			}else {
				ss2+=ss.charAt(i);
			}
		}
		System.out.println(ss);
		System.out.println(ss2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo();
	}

}
