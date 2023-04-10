package Exception;

import java.util.*;

class ageunderflowException extends Exception{
	public ageunderflowException(String msg) {
		super(msg);
	}
}

class ageoverflowException extends Exception{
	public ageoverflowException(String msg) {
		super(msg);
	}
}

class adharException extends Exception{
	public adharException(String msg) {
			super(msg);
	}
}

class Application{
	String name;
	int age;
	//String nationality;
	//String country="India";
	String adhar;
	Scanner in=new Scanner(System.in);
	public void input() {
		//System.out.println("please provide ur nationality");
		//nationality=in.nextLine();
		System.out.println("enter the name and age as same as in Adhar");
		name=in.nextLine();
		age=in.nextInt();
		System.out.println("enter the adhsr number");
		adhar=in.next();
	}
	
	public void verify() throws ageunderflowException, ageoverflowException, adharException {
		
		
		if(age < 18) {
			ageunderflowException au=new ageunderflowException("rukoo sara sabar karoo");
			System.out.println(au.getMessage());
			throw au;
		}
		else if(age >60) {
			ageoverflowException ao=new ageoverflowException("rukoo sara sabar karoo");
			System.out.println(ao.getMessage());
			throw ao;
		}
		else {
			System.out.println("you are eligible for applying the lincense");
		}
		if(adhar.length()==12) {
			System.out.println("CONGRATULATIONS........you are considered for registration");
		}
		else {
			adharException ad=new adharException("your adhar number is incorrect");
			System.out.println(ad.getMessage());
			throw ad;
		}
	}
	
}

class rto extends Application{
	
	public void initiate() {
		
		Application app=new Application();
		
		try {
			app.input();
			app.verify();
		} catch (ageunderflowException | ageoverflowException | adharException e) {
			// TODO Auto-generated catch block
			try {
				app.input();
				app.verify();
			} catch (ageunderflowException | ageoverflowException | adharException e1) {
				// TODO Auto-generated catch block
				try {
					app.input();
					app.verify();
				} catch (ageunderflowException | ageoverflowException | adharException e2) {
					// TODO Auto-generated catch block
					System.out.println("SORRY bhaiya only three chances.....");
				}
			}
		}
	}
	
}




public class ProjectOnExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rto  r=new rto();
		r.initiate();
	}

}
