package ioOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Launch6FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("manoj.txt");
		FileReader f1=new FileReader(f);
		int i=f1.read();
		
		//implementing read() method
		//it supports only one charat time
		while(i!=-1) {
		System.out.println((char)i+"====>");
		i=f1.read();
		System.out.println(i);
		}
		
		//implementing read(char[]) method
		//it can read complete data at one time
		char[] ch=new char[(int)f.length()];
		f1.read(ch);
		
		for(char data:ch)
			System.out.print(data);
		
	}

}
