package Interfaces100000;

public class Hello {
	
	static int a=10;
	void hello(){
		int b=10;
		System.out.println(a+" "+b);
		++a;
		++b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Hello h=new Hello();
		h.hello();
		h.hello();
		h.hello();
	}

}
