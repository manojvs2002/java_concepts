package Exception;

import java.util.Scanner;

class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msg) {
		
		super(msg);
	}
}



class Atm{
	int userid=1212;
	int password=1111;
	int usid,pswd;
	Scanner in=new Scanner(System.in);
	
	public void input()
	{
		System.out.println("enter the user id ");
		usid=in.nextInt();
		System.out.println("enetr the password");
		pswd=in.nextInt();
	}
	
	public void verify() throws InvalidCustomerException
	{
		if((userid == usid) &&(password==pswd))
		{
			System.out.println("take the cash");
		}
		else
		{
			InvalidCustomerException ice=new InvalidCustomerException("arey saale correct userid aur password dalo");
			System.out.println(ice.getMessage());
			
			
			
			//ice.printStackTrace();
			throw ice;
		}
	}
	
}

class Bank extends Atm{
	public void initiate()
	{
	Atm a=new Atm();
	
	try 
	{
		a.input();
		a.verify();
	} catch (InvalidCustomerException e)
	{
		try 
		{
			a.input();
			a.verify();
		} catch (InvalidCustomerException e1)
		{
			try 
			{
				a.input();
				a.verify();
			} catch (InvalidCustomerException e2)
			{
				System.out.println("chooor.......... mardoooo bsdk");
				System.exit(0);
				
			}
			
		}
		
	}
	}
	
}

public class LaunchCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.initiate();

	}

}
