package ioOperations;

import java.io.*;
public class Launch3 {

	public static void main(String[] args) throws IOException {
		
		File dir=new File("ioOperations");
		dir.mkdir();
		System.out.println("is a directory :"+dir.isDirectory());
		
		File file=new File(dir,"manoj.txt");
		file.createNewFile();
		System.out.println("is a file :"+file.isFile());
		
		
		File dir1=new File("c:\\images");
		dir1.mkdir();
		
		File f1=new File(dir1,"WhatsApp Image 2022-07-31 at 12.05.46 AM.jpeg");
		f1.createNewFile();
		
		
		
		
	}
}
