package functional_java;

public class Firstclass {
	
	public void number2(int number){
		for(int i=0; i<=number; i++) {
			System.out.println(i);
		}
	}
	
	public int numbers(int number) {
		for(int i=1; i<=number; i++) {
			System.out.println(i);
		}
//		if(number == 10) {
		return 1;
//		}else {
//			return false;
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firstclass f1 = new Firstclass();
		f1.number2(10);
		System.out.println(f1.numbers(10));
//		numbers(10);
		

	}

}
