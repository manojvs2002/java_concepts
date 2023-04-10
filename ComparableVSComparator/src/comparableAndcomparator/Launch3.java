package comparableAndcomparator;

import java.util.Comparator;
import java.util.TreeSet;

class Mylogic implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1= o1.toString();
		String s2= o2.toString();
		
		int n1=s1.length();
		int n2=s2.length();
			
		if(n1>n2)return +1;
			
		else if(n1<n2)return -1;
			
		else return -s1.compareTo(s2);
			
		
	}
	
}

public class Launch3 {
	
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new Mylogic()) ;
		
		t.add("a");
		t.add(new StringBuffer("ranojsxv"));
		t.add(new StringBuffer("kanojddcdddddsaxas"));
		t.add(new StringBuffer("ganojsdsdv"));
		t.add(new StringBuffer("sanojsdfcsdccsdsddssddd"));
		t.add("rew");
		t.add("z");
		t.add("a");
		
		System.out.println(t);
		
		
			
		
	}

}
