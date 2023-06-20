package File_Ex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter {
public static void main(String[] args) {
	File	f1=new File("d:\\asdf.txt");
	try {
		Scanner s=new Scanner(f1);
		while(s.hasNextLine())
		{
			String Str=s.nextLine();
		System.out.println(Str);	
		}
	} catch (IOException e) {
		System.out.println("Not Connected");
	}
}
}
