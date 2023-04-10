package ioOperations;

import java.io.File;

public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String location="C:\\Program Files (x86)";
		File f=new File(location);
		int dircount=0;
		int jpgfilecount=0;
		int txtfilecount=0;
		int zipfilecount=0;
		int count=0;
		String[] names=f.list();
		
		for(String name:names) {
			
			count++;
			File f1=new File(f,name);
			
			if(f1.isDirectory())
				dircount++;
			if(f1.isFile()) {
				if(name.endsWith(".zip"))
					zipfilecount++;
				if(name.endsWith(".txt"))
					txtfilecount++;
				if(name.endsWith(".jpg"))
					jpgfilecount++;
			}
					
			System.out.println(name);
		}
		System.out.println("total no of files::"+count);
		System.out.println("no of directories::"+dircount);
		System.out.println("no of  jpgfiles      ::"+jpgfilecount);
		System.out.println("no of  txtfiles      ::"+txtfilecount);
		System.out.println("no of  zipfiles      ::"+zipfilecount);
	}

}
