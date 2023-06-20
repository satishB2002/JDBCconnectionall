package Nov_JDBC;

public class Implementing_class {
public static void main(String[] args) throws ClassNotFoundException {
	if (Connection_class_object.connectDatabase()==null) {
		System.out.println("Database is Not Connected");
	} else {
       System.out.println("Database Connected");
	}
}
}
