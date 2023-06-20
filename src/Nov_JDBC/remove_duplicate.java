package Nov_JDBC;

import java.util.DuplicateFormatFlagsException;
import java.util.function.IntConsumer;

public class remove_duplicate {

	public static void main(String[] args) {
	int a[]= {1,2,2,2,3,3,4,4,4,5};
		for(int i=0; i<a.length-1; i++) {
			
			if(a[i]!=a[i+1]) {
				
				System.out.println(a[i]);	
			}
			
		}
		System.out.println(a[a.length-1]);
	}		
		}
		
		
		
	


