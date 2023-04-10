package CollectionForAPI;
import java.util.*;
public class LaunchCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add("manoj)");
		a2.add(10);
		a2.add(20.45);
		
		System.out.println(a2);
				
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.addFirst(a2);
		
		System.out.println(l1);
	
		l1.addFirst(l1);
		l1.addLast(l1);
		l1.clear();
		System.out.println(l1);
		
		
		System.out.println(l1.contains(a2));
		System.out.println(l1.getClass());
		System.out.println(l1.toString());
		System.out.println(l1);
		
		}

}
