package Wrapper;

class hello1{
	
	
	
	public void add(String data,int ...x) {
		int total = 0;
		for(int ele : x)
		{
			total+=ele;
		}
		System.out.println(data+"   the sum is"+total);
	}
}


public class varArgsProgram {
	
	
	public static void m1(Object l) {
		System.out.println("widening");
	}
	
	public static void m1(Number l) {
		System.out.println("widening in Long");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		
		m1(i);

	}

}
