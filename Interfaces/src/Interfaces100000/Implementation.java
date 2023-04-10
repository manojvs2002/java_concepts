package Interfaces100000;

interface Sample{
	 void method1();
	 void method2();
}

 abstract class SampleImp implements Sample{
	@Override
	public void method1()
	{
		System.out.println("welcome to method 1;;;;");
	}

	
	
	
}
 class SubSampleImple extends SampleImp{
	
	 @Override
	 public void method2()
	{
		System.out.println("welcome to method 2;;;;");
		
	}	
}

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s1=new SubSampleImple();
		s1.method1();
		s1.method2();
	}

}
