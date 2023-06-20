package File_Ex;

import java.io.FileWriter;
import java.io.IOException;

public class Ba {
public static void main(String[] args) {
	try {
		FileWriter x=new FileWriter("d:\\asdf.txt");
		x.write("My Name Is Satish");
		x.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
