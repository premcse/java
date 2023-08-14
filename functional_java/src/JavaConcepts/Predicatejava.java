package JavaConcepts;

import java.util.function.Predicate;

public class Predicatejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Predicate is a functional interface
		
		//test()
		Predicate<Integer> pr = i->i>100;
		System.out.println(pr.test(20));
		
		//and()
		Predicate<Integer> pr2 = i->i>100;
		Predicate<Integer> pr22 = i->i<200;
		
		Predicate<Integer> con = pr2.and(pr22);
		System.out.println(con.test(150));
		
		//or()
		Predicate<Integer> pr3 = i->i<100;
		Predicate<Integer> pr33 = i->i<=200;
		
		Predicate<Integer> con2 = pr3.or(pr33);
		System.out.println(con2.test(200));
		
		//negate()
		Predicate<Integer> dd = i->i>200;
		//It will act as i=i<200
		System.out.println(dd.test(100));
		
		//isEqual()
		Predicate<String> str = Predicate.isEqual("111aaa");
		System.out.println(str.test("111aa"));
		
	}

}
