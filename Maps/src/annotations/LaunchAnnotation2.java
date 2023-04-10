package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Course{
	String name();
	int credit();
}

@Course(name="manoj",credit=4)
class Student{
	
	private int sem;
	private int points;
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
}



public class LaunchAnnotation2 {
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.setSem(4);
		s.setPoints(9);
		
		System.out.println(s.getPoints()+ " "+s.getSem());
		
		Class c=s.getClass();
		Annotation an=c.getAnnotation(Course.class);
		Course co=(Course) an;
		
		
		
		System.out.println(1);
		
		
	}

}
