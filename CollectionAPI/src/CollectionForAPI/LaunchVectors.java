package CollectionForAPI;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class LaunchVectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(40);
		v.add(30);
		v.add(70);
		v.add(60);
		

		Enumeration en=v.elements();
		Collections.sort(v);
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		

	}

}
