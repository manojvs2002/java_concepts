package CollectionForAPI;

import java.util.*;

public class UsingOfIterators1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		Iterator it=al.iterator();
		
		if(it.hasNext()==true) {
			System.out.println(it.next());
		}
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("**********************");
		ListIterator l1=al.listIterator(al.size());
		
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
		
		System.out.println("this is for llinkednlisted data");
		
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("checking list in iterator form");
		
		Iterator ii=ll.iterator();
		
		if(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
		System.out.println("printing the list elements in normal order");
		
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
		
		ListIterator qq=ll.listIterator();
		
		System.out.println("prinnt the elements using for loop");
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("check the listierator working");
		
		if(qq.hasNext()) {
			System.out.println(qq.next());
		}
		
		System.out.println("to print elements in normal order ");
		
		while(qq.hasNext())
		{
			System.out.println(qq.next());
		}
		
		System.out.println("to print the lements in reverse order");
		
		while(qq.hasPrevious()) {
			System.out.println(qq.previous());
		}
		
		
		System.out.println("invoking descending iterator");
		
		//descending iteratir can ivoked in only three class
		//1.linkedlist
		//2.treeset
		//3.arraydeque
		
		LinkedList ll2=new LinkedList();
		ll2.add(100);
		ll2.add(200);
		ll2.add(300);
		ll2.add(400);
		ll2.add(500);
		
		System.out.println(ll2);
		
		Iterator ii1=ll2.descendingIterator();
		
		while(ii1.hasNext()) {
			//Integer i=(Integer) ii1.next();
			System.out.println(ii1.next());
		}
		
		
	}

}
