package File_Ex;

import java.io.File;
import java.io.IOException;

public class Ab {
public static void main(String[] args) {
	File f1	=new File("d:\\asdf.txt");
	try {
		if(f1.createNewFile())
			System.out.println("Create");
		else 
			
		System.out.println("Not Created");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
