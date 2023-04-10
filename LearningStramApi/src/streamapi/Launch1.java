package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Launch1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(105);
		al.add(103);
		al.add(106);
		
		ArrayList<Integer> evenlist=new ArrayList<Integer>();
		
		for(Integer i1:al) 
			if(i1%2==0) 
				evenlist.add(i1);
		System.out.println(evenlist);
		
		//using streams..............
		//to use it is possible from jdk1.8
		//1.configuraton   2.processing
		
		List<Integer> streamlist = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		streamlist.forEach(System.out::println);
	}

}
