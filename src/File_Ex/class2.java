package File_Ex;

import java.io.FileWriter;
import java.io.IOException;

public class class2 {
public static void main(String[] args) throws IOException {
	FileWriter f5=new FileWriter("d:\\satish.txt");
	f5.write("Satish Barate");
	f5.close();
	System.out.println("File Write");
}
}
