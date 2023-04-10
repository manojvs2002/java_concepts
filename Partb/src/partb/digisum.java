package partb;
import java.util.*;

public class digisum {
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int dsum=sumofdigit(n);
	     
	     while(n>=10)
	     {
	    	 n=dsum;
	    	 dsum=sumofdigit(n);
	     }
	     System.out.print("sum is"+dsum);}



	private static int sumofdigit(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}
}