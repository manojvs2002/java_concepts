package Enums;

enum course{
	
	JAVA,JEE,SPRING;
	
	int cid;
	
	course()
	{
		System.out.println("constructor");
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
}

public class LaunchEnum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		course.JAVA.setCid(10);
		
		int c=course.JAVA.getCid();
		
		System.out.println(c);

	}

}
