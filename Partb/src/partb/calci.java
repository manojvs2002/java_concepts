package partb;
import java.util.*;

public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int ch=0;
		
		do
		{
			System.out.println("enetr the operanss");
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.print("enter the choicce");
			ch=in.nextInt();
			switch(ch)
			{
				case 1:System.out.print("adding 2 operands="+(a+b));
						break;
				case 2:System.out.print("sub 2 operands="+(a-b));
				break;
				case 3:System.out.print("mul 2 operands="+(a*b));
				break;
				case 4:System.out.print("div 2 operands="+(a/b));
				break;
				case 5:System.out.print("mod 2 operands="+(a%b));
				break;
				default:System.out.print("invalid");
				break;
			}
		}while(ch>5);

	}

}
