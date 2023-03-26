package comparableAndcomparator;

import java.util.Comparator;
import java.util.TreeSet;

class mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// logic which ever the developer is need in
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		
		
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
		return 0;
	}
	
}

public class LaunchComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t=new TreeSet(new mycomparator());
		
		t.add(10);
		t.add(20);
		t.add(40);
		t.add(70);
		t.add(990);
		t.add(13);
		t.add(105);
		
		System.out.println(t);
		

	}

}
