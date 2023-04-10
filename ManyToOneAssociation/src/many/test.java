package many;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Branch branch=new Branch();
		branch.setBid(1);
		branch.setBname("india");
		
		Student s1=new Student();
		s1.setSname("manoj");
		s1.setSadd("MI");
		s1.setSid(1);
		s1.setBranch(branch);
		
		Student s2=new Student();
		s2.setSname("varu");
		s2.setSadd("RCB");
		s2.setSid(2);
		s2.setBranch(branch);
		
		Student s3=new Student();
		s3.setSname("Dhoni");
		s3.setSadd("csk");
		s3.setSid(3);
		s3.setBranch(branch);
		
		
		System.out.println("Details of stiudents");
		System.out.println();
		System.out.println("sNmae ::"+s1.getSname());
		System.out.println("sId ::"+s1.getSid());
		System.out.println("saddress ::"+s1.getSadd());
		System.out.println("sBranch name ::"+s1.getBranch().getBname());
		System.out.println("Branch id    ::"+s1.getBranch().getBid());
		System.out.println("==========================");
		
		
		System.out.println("sNmae ::"+s2.getSname());
		System.out.println("sId ::"+s2.getSid());
		System.out.println("saddress ::"+s2.getSadd());
		System.out.println("sBranch name ::"+s2.getBranch().getBname());
		System.out.println("Branch id    ::"+s2.getBranch().getBid());
		System.out.println("==========================");
		
		
		System.out.println("sNmae ::"+s3.getSname());
		System.out.println("sId ::"+s3.getSid());
		System.out.println("saddress ::"+s3.getSadd());
		System.out.println("sBranch name ::"+s3.getBranch().getBname());
		System.out.println("Branch id    ::"+s3.getBranch().getBid());
	}

}
