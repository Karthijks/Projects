package a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class AppSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Spring Core Container is created!!!!");
		System.out.println("---------setter injection-----------");
		ApplicationContext ap = new ClassPathXmlApplicationContext("karthi.xml");
		System.out.println(ap);
		System.out.println("---------setter injection-----------");
		Student s1 = (Student) ap.getBean("x");
		System.out.println("name is " + s1.getName() + " the address is " + s1.getAddress());

		System.out.println("---------constructor injection-----------");
		Student s2 = (Student) ap.getBean("y");
		System.out.println("name is " + s2.getName() + " the address is " + s2.getAddress());
		// Singleton design pattern
		Student s3 = (Student) ap.getBean("y");
		System.out.println("name is " + s3.getName() + " the address is " + s3.getAddress());
		System.out.println(s2 == s3);
		System.out.println(s2.hashCode() + "    " + s3.hashCode());

		System.out.println("-----------prototype------------");
		Student u1 = (Student) ap.getBean("t");
		Student u2 = (Student) ap.getBean("t");
		System.out.println(u1 == u2);

	}

}
