package partb;
import java.util.*;

public class lexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the strings");
		String[] a=new String[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.next();
		}
		Arrays.sort(a);
		System.out.println("after sorting");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}

}
