package AccessSpecifiers;
abstract class Loan1///abstraccctionSSSSS
{
	public Loan1() ///constructor..
	{
		System.out.println("this constructor is for loan1");
	}
	
	abstract public void dispInt();
	
	 public void welcomeNote()
	{
		System.out.println("Welcome to xxx bank");
	}
}

class HomeLoan1 extends Loan1
{

	public HomeLoan1()///constructor..
	{
		System.out.println("this cconstructor is  for home loan");
		
	}
	public void dispInt()
	{
	
		System.out.println("RI is 12%");
		
	}
	//abstract public void dispInt();
}
class EducationLoan1 extends Loan1 ///inheritance
{
	public EducationLoan1()///constructor..
	{
		System.out.println("this constructor is for education loan");
	}

	
	public void dispInt() 
	{
		System.out.println("RI is 10%");
	}
	
}
//polymorphism........................................
class Permit{
	public void permit1(Loan1 l)
	{
		l.dispInt();
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loan1 l=new Loan1();
		Loan1 l=new HomeLoan1();
		Loan1 a=new EducationLoan1();
		Permit p=new Permit();
		
		p.permit1(l);
		p.permit1(a);
	}

}
