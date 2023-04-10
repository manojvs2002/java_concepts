package Interfaces100000;

interface demo1{
	void m1();
}

interface demo2{
	void m2();
}

interface demo3 extends demo1,demo2{
	void m3();
	
}

class Sample1 implements demo3{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
public class InterfacePart3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
