package partb;
import java.util.*;
public class password {
	public static void main(String[] args) 
	{
	Scanner in=new Scanner(System.in);
	String name=in.next();
	String pw=new String();
	long ph=in.nextLong();
	int rno=in.nextInt();
	String[] sym= {"!","@","#","$","%","^","&","*","(",")"};
	int rem,sum=0;
	while(rno!=0)
	{
		rem=rno/10;
		sum+=rem;
		rno=rno/10;
		
	}
	if(sum>=10)
	{
		rem=rno/10;
		sum+=rem;
		rno=rno/10;
	}
	int c=rno/100;
	int len=name.length();
	pw=" "+name.charAt(0)+(ph%10)+sum+sym[c]+name.charAt(len-1);
	System.out.println(pw);
	
	}
}
