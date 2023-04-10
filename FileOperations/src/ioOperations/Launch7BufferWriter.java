package ioOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Launch7BufferWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter f=new FileWriter("abc.txt",true);
		BufferedWriter b=new BufferedWriter(f);
		
		b.write(109);
		
		
		b.write("anoj");
		b.newLine();
		
		char[] ch= {'h','e','l','l','o'};
		b.write(ch);
		
		b.flush();
		
		b.close();

	}

}
