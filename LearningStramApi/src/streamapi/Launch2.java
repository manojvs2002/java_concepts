package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Launch2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		
		System.out.println(al);
		
		ArrayList<Integer> two=new ArrayList<Integer>();
		for(Integer i1:al)
			two.add(i1*2);
		System.out.println(two);
		
		List<Integer> list=al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("using lambda expression");
		list.forEach(i->System.out.println(i*2));
		
		System.out.println("using streams concept");
		list.forEach(System.out::println);
		

	}

}
