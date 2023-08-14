package JavaConcepts;

import java.util.Stack;

public class Stackjava {
	
	//Stack ->Last in first out
	public void Stackmethod() {
		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Bear");
		animals.push("Lion");
		System.out.println(animals);
		animals.pop();
		System.out.println(animals);
		animals.push("elephant");
		System.out.println(animals);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackjava abc = new Stackjava();
		abc.Stackmethod();
	}

}
