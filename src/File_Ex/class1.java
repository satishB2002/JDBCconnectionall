package File_Ex;

import java.io.File;
import java.io.IOException;

public class class1 {
public static void main(String[] args) {
	File fl =new File("d:\\satish.txt");
	try {
		if(fl.createNewFile())
		System.out.println("Crated");
		else {
			System.out.println("not Created");
		}
	} catch (IOException e) {
		System.out.println("Not Connectes");
	}
}
}
