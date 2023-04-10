package ioOperations;

import java.io.*;

public class Launch2 {

	public static void main(String[] args) {
	String directoryname="manoj";
	File f=new File(directoryname);
	System.out.println(f.exists());
	
	f.mkdir();
	
	System.out.println(f.exists());
}

		


}
