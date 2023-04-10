package Exception;

import java.util.Scanner;

class divide3{
	void div()
	{
		try {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		int res=n1/n2;
		
		System.out.println("RES IS "+res);
		}
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println("HAndlid in div only");
			
			
		}	
	}	
}

public class Launch3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		divide3 d =new divide3();
		d.div();		
	}

}
