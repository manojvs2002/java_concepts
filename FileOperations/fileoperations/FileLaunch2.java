package fileoperations;

//file1.txt file2.txt copy one line from file1.txt and from file2.txt
//to file3.txt.

import java.io.*;

public class FileLaunch2 {

	public static void main(String[] args) throws Exception {
		
		PrintWriter f3=new PrintWriter("thirdfile.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("first.txt"));
		String line=br.readLine();
		
		BufferedReader br1=new BufferedReader(new FileReader("second.txt"));
		String line1=br1.readLine();
		
		while(line!=null) {
			f3.print(line);
			line=br.readLine();
			f3.print(line1);
			line=br1.readLine();
		}
		
		
		
		
		f3.flush();
		
		br.close();
		f3.close();
		
		System.out.println("open third.txt to see the output");

	}

}
