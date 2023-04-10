package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Launch3 {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("manoj");
		ll.add("fanojksjn");
		ll.add("aanojnsjx");
		ll.add("lanojjods");
		ll.add("qanoj");
		
		List<String> al=new LinkedList<String>();
		for(String s:ll)
			if(s.length()==5)
				System.out.println(s);
		
		List<String> list=ll.stream().filter(i->i.length()==5).collect(Collectors.toList());
		System.out.println(list);
		
		//list.forEach(i->System.out.println(i.length()==6));
		
		list.forEach(System.out::println);
			

	}

}
