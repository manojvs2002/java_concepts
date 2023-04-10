package one;

public class Employee {
	
	private String ename;
	private int age;
	private String add;
	
	
	Account account;//Has relation

	public Employee(String ename, int age, String add, Account account) {
		super();
		this.ename = ename;
		this.age = age;
		this.add = add;
		this.account = account;
	}
	
	public void empdetails()
	{
		System.out.println("Employee details:");
		System.out.println("empage   :"+age);
		System.out.println("empname   :"+ename);
		System.out.println("empadd   :"+add);
		System.out.println("account details");
		System.out.println("accid   :"+account.accid);
		System.out.println("acc name     :"+account.aname);
		System.out.println("acc type    :"+account.atype);
	}
	
	

	

}
