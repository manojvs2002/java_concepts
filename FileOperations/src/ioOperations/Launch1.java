package ioOperations;

import java.io.*;

public class Launch1 {
	
	public static void main(String[] args) throws IOException {
		
		String filename="abc.txt";
		
		//this line will check whether the file called "abc.txt" exists or not 
		//if it is available then it would go and point to file
		//otherwisw it will represent a java file object,not physical object
		File f=new File(filename);
		System.out.println(f.exists());
		
		f.createNewFile();
		
		System.out.println(f.exists());
	}

}
