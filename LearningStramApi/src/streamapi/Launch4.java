package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Launch4 {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("manoj");
		ll.add("fanojksjn");
		ll.add("aanojnsjx");
		ll.add("lanojjods");
		ll.add("qanoj");
		ll.add("sd");
		ll.add("qanojjasbh");
		ll.add("qanojxkksxxxs");
		ll.add("sxnas");
		
		System.out.println(ll);
		
		List<String> uppercase=new LinkedList<String>();
		for(String s:uppercase)
		{
			System.out.println(s.toUpperCase());
		}
		
		
		List<String> list=ll.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println();
		
		list.forEach(i->System.out.println(i.toUpperCase()));
		
		System.out.println();
		list.forEach(System.out::println);
		
		//to count the no of objects we use 'count()' method
		long count=ll.stream().filter(i->i.length()>5).count();
		System.out.println("the no of objects in the list are"+count);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(5);
		al.add(3);
		al.add(106);
		
		System.out.println(al);
		
//to sort the objects inside the list or sets we use sorted() method
		
		//to perform natural sorting order we directly use sorted() methos
		List<Integer> numberlist=al.stream().sorted().collect(Collectors.toList());
		System.out.println("after sorting  " + numberlist);
		
//but for usrdefined sorting method we need costomise
//to apply customised sorting methos we use comparator 
//i.e we are overriding compare method which is present insude compartor interface
//since it is a functional interface we can write it has a lambda expression
		System.out.println();
	List<Integer> numberlist1 =	al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
	System.out.println("after applyting the logic"+numberlist1);
	
	
	//when we need a max or min objects in list or set we use min() or max( methods
	Integer min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println("min value is"+min);
	
	Integer max=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println("min value is"+max);
	
	
	
	
	}
	

}
