package Exception;

import java.util.Scanner;

class divide1{
	void div() throws ArithmeticException
	{
		try {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the two nos");
		int n1=in.nextInt();
		int n2=in.nextInt();
		int res=n1/n2;
		
		System.out.println("RES IS "+res);
		}
		catch(ArithmeticException e) {
			System.out.println("HAndlid in div only");
			throw e;
		}
		finally {
		System.out.println("Sytem is terminated");
		}
	}
		
}

public class Launch2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		divide1 d=new divide1();
		d.div();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled in main block");
		}
		

		
	}

}
