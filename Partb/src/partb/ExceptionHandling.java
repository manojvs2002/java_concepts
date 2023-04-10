package partb;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			try {
		
			int[] a= {1,2,3};
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of bound");
			
		}
			System.out.println(4/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Arithemetic Exception :divide by 0");
		}
		
		}
	}
