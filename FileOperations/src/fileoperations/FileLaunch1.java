package fileoperations;

import java.io.*;

//file1.txt,file2.txt copy all to file3.txt

public class FileLaunch1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		PrintWriter f3=new PrintWriter("file3.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
		String line=br.readLine();
		
		while(line!=null) {
			f3.println(line);
			line=br.readLine();
		}
		
		br=new BufferedReader(new FileReader("file2.txt"));
		 line=br.readLine();
			
			while(line!=null) {
				f3.println(line);
				line=br.readLine();
			}
			
			f3.flush();
			
			
			br.close();
			f3.close();
			
			System.out.println("open the file3.txt to see output");

	}

}
