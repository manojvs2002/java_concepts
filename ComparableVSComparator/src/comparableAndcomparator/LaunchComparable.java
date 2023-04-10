package comparableAndcomparator;

import java.util.TreeSet;

public class LaunchComparable {
	
	public static void main(String[] args) {
		
		//in backend it uses comparable interface and 
		//to sort the objects
		//it sorts in ascending order by default
		//to sort the given object in descending or develooper needed order we use
		//comparator interface
		//inside comparable interface we have a method name compareto()
		//which works("v":.compareto("a");
		//if the v is greater than it gives +ve value
		//if v is smaller then a it gives negative value
		//if both are equal it gives 0
		//here v and a R considered as two objects
		
		TreeSet tr=new TreeSet();
		tr.add("a");
		tr.add("v");
		tr.add("s");
		tr.add("w");
		tr.add("a");
		
		
		System.out.println(tr);
		
		
	}
	
	
	

}
