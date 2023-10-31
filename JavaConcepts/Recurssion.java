package JavaConcepts;

public class Recurssion {
	
	public static int demo(int a) {
		if(a== 10) {
		System.out.println("fine");
		return a;
		}else {
			a++;
			System.out.println(a);
			demo(a);
			return a;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recurssion rs = new Recurssion();
		demo(1);
		
	}

}
