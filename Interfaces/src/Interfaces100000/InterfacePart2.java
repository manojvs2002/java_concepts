package Interfaces100000;

class one{
	
	public void m1()
	{
		System.out.print("hello this m1 method");
	}
}
interface onetwo{
	
	void m2();
}

class manu extends one implements onetwo 
{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
		System.out.print("hello this m2 method");
	}

	
}

public class InterfacePart2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		manu obj=new manu();
		obj.m2();
		obj.m1();
		
	}

}
