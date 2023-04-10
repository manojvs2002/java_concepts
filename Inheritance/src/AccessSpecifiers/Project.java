package AccessSpecifiers;

import java.util.Scanner;

// to find the Areas of shapes;
abstract class shapes{
	 double area;
	 abstract public void input();
	 abstract public void compute();
	 public void display()
		{
			
			System.out.println("after computing the are is:"+area);
		}
 }

class rectangle extends shapes
{
	Scanner in=new Scanner(System.in);
	float length;
	float breadth;
	
	
	public void input()
	{
		System.out.println("enter the length and breadth of rectangle");
		length=in.nextFloat();
		breadth=in.nextFloat();
	}
	public void compute()
	{
		area=length*breadth;
	}
	
}
class circle extends shapes
{
	Scanner in=new Scanner(System.in);
	double radius;
	
	final double pi= 3.14;
	
	public void input()
	{
		System.out.println("enetr the radius of the circle");
		radius=in.nextDouble();
	}
	public void compute()
	{
		area=pi*radius*radius;
	}
	
}
class square extends shapes
{
	Scanner in=new Scanner(System.in);
	double length;
	public void input()
	{
		System.out.println("enetr the length of square");
		length=in.nextDouble();
	}
	public void compute()
	{
		area=length*length;
	}
	
}
class permit123{
	 public void permit1(shapes s)
	 {
		 s.input();
		 s.compute();
		 s.display();
	 }
}
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r=new rectangle();
		circle c=new circle();
		square s=new square();
		permit123 p=new permit123();
		
		p.permit1(c);
		p.permit1(s);
		p.permit1(r);
		
	}
}
