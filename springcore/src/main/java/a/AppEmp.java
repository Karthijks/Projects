package a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salary s = new Salary(2000, 500, 50);
		Employee e = new Employee(10, "KK", s);
		System.out.println(e.getSalary().getNetpay());

		Employee e1 = new Employee();
		e1.setEmpName("BB");
		Salary f = new Salary(5000, 222, 100);
		e1.setEmpNumber(22);
		e1.setSalary(f);
		System.out.println(e1.getSalary().getNetpay());

		System.out.println("-----------------using spring--------------");
		ApplicationContext ap = new ClassPathXmlApplicationContext("karthi.xml");
		System.out.println(ap);
		Employee e2 = (Employee) ap.getBean("q");
		System.out.println(e2.getSalary().getNetpay());
		System.out.println("-----------------using spring autowire byType--------------");
		ApplicationContext ap2 = new ClassPathXmlApplicationContext("karthi2.xml");
		Employee2 e3 = (Employee2) ap2.getBean("emp2");
		System.out.println(e3.toString());
		System.out.println(e3.getSalary().getNetpay());

		System.out.println("-----------------using spring autowire byName--------------");
		ApplicationContext ap3 = new ClassPathXmlApplicationContext("karthi3.xml");
		Employee3 e4 = (Employee3) ap3.getBean("emp3");
		System.out.println(e4.getSalary());

	}

}
