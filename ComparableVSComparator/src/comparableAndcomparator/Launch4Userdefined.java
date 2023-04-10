package comparableAndcomparator;

import java.util.Comparator;
import java.util.TreeSet;


class Employee implements Comparable{
	String name;
	int id;
	
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public String toString() {
		return  name +" ===== "+ id;
		
	}
	public int compareTo(Object o) {
		
		//sorting based on empl id
		int id1=this.id;;
		Employee emp=(Employee) o;
		int id2=emp.id;
		
		if(id1>id2)return +1;
		else if(id1<id2)return -1;
		else
		return 0;
		
	}
}
public class Launch4Userdefined {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Employee e1=new Employee("manoj",10);
		Employee e2=new Employee("hiii",80);
		Employee e3=new Employee("chethan",20);
		Employee e4=new Employee("aabd",70);
		Employee e5=new Employee("sachin",50);
		

		
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
		
		
		
		TreeSet t1=new TreeSet(new Logic());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		
		System.out.println(t1);
		
		
	}

}
class Logic implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// sorting based on name====
		Employee emp1=(Employee) o1;
		Employee emp2=(Employee) o2;
		
		String s1=emp1.name;
		String s2=emp1.name;
		
		return s1.compareTo(s2);
	}
	
}