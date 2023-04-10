package ioOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Launch8BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader f=new FileReader("abc.txt");
		BufferedReader b=new BufferedReader(f);
		
		String line=b.readLine();
		
		while(line!=null) 
		{
			System.out.println(line);
			line=b.readLine();
		}
		
		b.close();
	
	}

}
