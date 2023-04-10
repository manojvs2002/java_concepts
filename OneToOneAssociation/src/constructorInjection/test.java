package constructorInjection;

import one.Account;
import one.Employee;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Account account=new Account(1,"account1","savings");
		
		//constructor injection
		Employee emp=new Employee("manoj",12,"12,5th cross",account);
		
		emp.empdetails();

	}

}
