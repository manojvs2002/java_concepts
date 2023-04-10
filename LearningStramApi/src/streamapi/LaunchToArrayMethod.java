package streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class LaunchToArrayMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(5);
		al.add(3);
		al.add(106);
		
		System.out.println(al);
		
		Object[] objarr=al.stream().toArray();
		for(Object obj:objarr)
			System.out.println(obj);
		
		//we use constructor refernce for converting it to Integer objects
		Integer[] objarr1=al.stream().toArray(Integer[]::new);
		for(Integer obj1:objarr1)
			System.out.println(obj1);
		
		//stream.of() is used for group of values
		Stream s=Stream.of(9,99,999,9,9);
		s.forEach(System.out::println);
		
		//we can also use stream.of() method for arrays 
		//since array containd grroup values
		Integer[] i= {1,2,3,4,5,6,6};
		Stream s1=Stream.of(i);
		s1.forEach(System.out::println);
		
	}

}
