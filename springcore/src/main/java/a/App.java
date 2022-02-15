package a;

public class App {
	public static void main(String[] args) {
		// Initializing object using Setter methods
		System.out.println("-------------dependency PULLING by OBJECT Setter ---------------------");
		Student s = new Student();
		s.setName("selva");
		s.setAddress("Chennai");
		System.out.println(s);
		System.out.println(s.getName() + "   " + s.getAddress());

		// Initializing object using parameterized Constructor
		System.out.println("-------------dependency PULLING by OBJECT Constructor ---------------------");

		Student ss = new Student("karthi", "Delhi");
		System.out.println(ss);
		System.out.println(ss.getName() + "   " + ss.getAddress());

	}
}
