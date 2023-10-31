package JavaConcepts;

public class Methodoverloading {
	
	public void democlass1(int a) {
		System.out.println(a);
		System.out.println("3 rd int class");
	}
	
	public void democlass1(double a) {
		System.out.println(a);
		System.out.println("1 st double class");
	}
	
	public void democlass1(long a) {
		System.out.println(a);
		System.out.println("2 nd long class");
	}
	
//	public void democls(String a) {
//		System.out.println(a);
//		System.out.println("1st string class");
//	}
//	
//	public void democls(String b) {
//		System.out.println(b);
//		System.out.println("1st string class");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading ab = new Methodoverloading();
		ab.democlass1(300);
		
	}

}
