package partb;
import java.util.*;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		
		while(true)
			
		{
			int n=in.nextInt();
			if(n<=0)
			{
				System.out.println("invalid inputr");
			}
			else
			{
				int sum=0;
				while(n!=0)
				{
					sum=sum+n*n;
					n--;
				}
				System.out.print("no of square matr are"+sum);
			}
		}

	}

}
