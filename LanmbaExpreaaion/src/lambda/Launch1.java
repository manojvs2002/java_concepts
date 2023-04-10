package lambda;


interface demo{
	void disp();
	
	
}
interface demo1{
	void add(int a,int b);
}
class sys implements demo,demo1{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo d=new demo() {
			public void disp()
			{
				System.out.println("hiiii");
			}
			
		};
		demo1 d1=new demo1() {
			
			public void add(int a,int b) {
				
				int c=a+b;
				System.out.println(c);
			}
		};
		d1.add(10,20);
		d.disp();
		
		
		
		
	
	//	demo d = ()->System.out.println("hello");
		//d.disp();
	}

}
