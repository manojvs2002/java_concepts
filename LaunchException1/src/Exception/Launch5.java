package Exception;

import java.util.Scanner;

class divide5{
	void div() throws ArithmeticException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the two nos");
		int n1=in.nextInt();
		int n2=in.nextInt();
		try {
		System.out.println("this is outside try block");
		int res=n1/n2;
		System.out.println("RES IS "+res);
		try {
			System.out.println("this is try block inside a try block");
			System.out.println("enter the two nos ");
			int a=in.nextInt();
			int b=in.nextInt();
			int result=a/b;
			System.out.println("RES IS "+result);
			
		}
		catch(ArithmeticException ep) {
			System.out.println("this is catch block insde try block");
		}
		finally {
			System.out.println("this is final block inside the try block");
		}
		}
		catch( ArithmeticException e) {
			System.out.println("this is outside catch block");
			try {
				System.out.println("this is try block inside outside catch block");
				System.out.println("enter the two nos");
				int a=in.nextInt();
				int b=in.nextInt();
				int result=a/b;
				System.out.println("RES IS "+result);
				
			}
			catch(ArithmeticException ep) {
				System.out.println("this is catch block insde outer catch  block");
			}
			finally {
				System.out.println("this is final block inside the outer catch block");
			}
			
		}
		finally {
			System.out.println("this is outer finally block");
			try {
				System.out.println("this is try inside a final block");
				System.out.println("enter the two nos");
				int a=in.nextInt();
				int b=in.nextInt();
				int result=a/b;
				System.out.println("RES IS "+result);
				
			}
			catch(ArithmeticException ep) {
				System.out.println("this is catch block insde final block");
			}
			finally {
				System.out.println("this is final block inside the final block");
			}
			}
		
	}
}

public class Launch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		divide5 d=new divide5();
		d.div();
	}

}
