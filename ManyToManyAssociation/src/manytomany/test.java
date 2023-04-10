package manytomany;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Courses c1=new Courses("java",1);
		Courses c2=new Courses("c++",2);
		Courses c3=new Courses("python",3);
		
		Courses[] course=new Courses[3];
		course[0]=c1;
		course[1]=c3;
		course[2]=c2;
		
		Student s1=new Student("sachin",1,"mi",course);
		Student s2=new Student("kholi",2,"rcb",course);
		Student s3=new Student("dhoni",3,"csk",course);
		
		s1.getstudentdetails();
		s2.getstudentdetails();
		s3.getstudentdetails();
		
		
		

	}

}
