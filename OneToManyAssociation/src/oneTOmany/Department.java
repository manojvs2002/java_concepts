package oneTOmany;

import java.util.Arrays;

//target object
public class Department {

	private String dname;
	private int deptid;
	
	//has-A relation
	private Employee[] emp;
	
	//constructor
	public Department(String dname, int deptid, Employee[] emp) {
		super();
		this.dname = dname;
		this.deptid = deptid;
		this.emp = emp;
	}
	
	
	public void getDeptdetail()
	{
		System.out.println("Department Details");
		System.out.println("Department name  :"+dname);
		System.out.println("Department id  :"+deptid);
		System.out.println("=======================");
		System.out.println("employeee details");
		for(Employee employee:emp)
		{
			System.out.println("employee name: "+employee.ename);
			System.out.println("employee address: "+employee.eadd);
			System.out.println("employee identit: "+employee.eid);
		}
		System.out.println("");
	}
	
	
	
	
	
}
