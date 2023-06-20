package File_Ex;

import java.io.File;
import java.io.IOException;

public class Ex {
public static void main(String[] args) {
	File ff=new File("d:\\Beta Harami hai.txt");
	try {
		if(ff.createNewFile())
		
		
		System.out.println("File Craeated");
		else
			System.out.println("File Not  Craeated");
	} catch (IOException e) {
		System.out.println("File Not Connected");
	}
	
}
}
