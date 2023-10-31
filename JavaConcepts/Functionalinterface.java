package JavaConcepts;

public interface Functionalinterface {
			void demomethod(int a, String b);
			
			default void log(String str){
				System.out.println("I1 logging::"+str);
			}
			
			static void Print(String str){
				System.out.println("I2 logging::"+str);
			}

}
