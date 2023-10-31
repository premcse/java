package JavaConcepts;

public class FunctionalinterfaceIMPL implements Functionalinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Functional interface using lamda expression
		Functionalinterface i1 = (s,ss) -> System.out.println("ggg"+s+ss);
		i1.demomethod(2,"321");
		
		new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
		
		new Thread(() ->{
                System.out.println("New thread created2");
        }).start();
		FunctionalinterfaceIMPL cv = new FunctionalinterfaceIMPL();
		cv.log("prem");
	}
		

	Runnable r1 = () -> {
		System.out.println("My Runnable");
	};
	@Override
	public void demomethod(int a, String b) {
		// TODO Auto-generated method stub
		
	}
	

}
