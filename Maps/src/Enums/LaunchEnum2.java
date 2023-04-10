package Enums;

enum Result1{
	PASS,FAIL,NR;
	
	//behind the scene
	//PASS---->public static final Result =new Result()
	
	Result1(){//in enum making constructor public is invalid
		System.out.println("constructor");
	}
}

public class LaunchEnum2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result1 res=Result1.PASS;
		System.out.println(res);
		
		Result1 resarr[]=Result1.FAIL.values();
		
		for(Result1 hi:resarr) {
			System.out.println(hi.name()+" "+hi.ordinal());
		}
	}

}
