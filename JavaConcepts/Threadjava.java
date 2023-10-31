package JavaConcepts;

public class Threadjava extends Thread{
	
	 public void run() {
		   // System.out.println("This code is running in a thread");
		 
		System.out.println("This code is runniong inside thread");
		  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadjava th = new Threadjava();
		System.out.println("This code is running out a thread1");
		th.start();	
		System.out.println("This code is running out a thread");;
		}

}
