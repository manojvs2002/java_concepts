package ioOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Launch5FileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1=new File("manoj.txt");
		FileWriter f2=new FileWriter(f1,true);
		
		f2.write(97);
		f2.write("\n");
		
		f2.write("hello this is chitti robo");
		f2.write("\n");
		char[] ch= {'a','b','c','d'};
		f2.write(ch);
		
		f2.flush();
		
		f2.close();
		
		System.out.println("open the file");

	}

}
