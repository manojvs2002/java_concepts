package manytomany;

//target object
public class Student {

	String sname;
	Integer sid;
	String sadd;
	
	//Has-A realtion
	Courses[] course;

	public Student(String sname, Integer sid, String sadd, Courses[] course) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sadd = sadd;
		this.course = course;
	}
	
	void getstudentdetails()
	{
		System.out.println("student details are ..... ");
		System.out.println("SID Is::  "+sid);
		System.out.println("Sadd Is::  "+sadd);
		System.out.println("Sname Is::  "+sname);
		System.out.println("course details are/.......");
		for(Courses c:course)
		{
		System.out.println("course id Is::  "+c.cid);
		System.out.println("course name is::  "+c.cname);
		}
	}
}
