package JavaConcepts;

import java.util.List;

import java.util.stream.Collectors;

public class Streammap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> it = List.of(2,3,4,5,6);
		List num = it.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(num);
		
		List<String> itt = List.of("eeee","qqqqq","yyyy");
		List numm = itt.stream().map(nm->nm.startsWith("e")).collect(Collectors.toList());
		System.out.println(numm);
		
		List<String> ittt = List.of("eeee","yyyy","qqqqq");
		ittt.stream().forEach(System.out::println);
				//.sorted().collect(Collectors.toList());
		//System.out.println(i);

	}

}
