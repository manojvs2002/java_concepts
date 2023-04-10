package oneTOmany;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Employee e1=new Employee ("sachin",1,"mi");
		Employee e3=new Employee("dhoni",3,"csk");
		Employee e2=new Employee("rqahul",2,"rcb");
		
		Employee[] emps=new Employee[3];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		
		
		Department department=new Department("danda",12345,emps);
		department.getDeptdetail();
		
		
	}

}
