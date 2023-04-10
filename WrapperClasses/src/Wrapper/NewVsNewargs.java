package Wrapper;

class Student{
	
	static {
		System.out.println(".class file is loading");
	}
	
	Student(){
		System.out.println("constructor is created");
		
	}
}

public class NewVsNewargs {

	static {
		System.out.println("hello this is static block");
	}
	public static void main(String[] args) throws Exception
	{
		
		Student std1=new Student();
		System.out.println(std1);
	
		String className=args[0];
		
		Object obj=Class.forName(className).newInstance();
		System.out.println(obj.getClass().getName());
	 	
	 	
	}
}
