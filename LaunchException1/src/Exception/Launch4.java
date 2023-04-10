package Exception;

import java.util.Scanner;

class divide4{
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
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("HAndlid in div only");
			
		}
		finally {
			System.out.println("Sytem is terminated");
			}
		
	}
}

public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide4 d=new divide4();
		d.div();

	}

}
