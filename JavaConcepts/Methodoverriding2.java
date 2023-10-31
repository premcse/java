package JavaConcepts;

public class Methodoverriding2 extends Methodoverriding1 {
	
	@Override
	public void demooverriding() {
		super.demooverriding();
		System.out.println("qqqqqqqqqqq");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Methodoverriding1 abc = new Methodoverriding1();
//		abc.demooverriding();
		
		Methodoverriding2 abcd = new Methodoverriding2();
		abcd.demooverriding();

	}

}
