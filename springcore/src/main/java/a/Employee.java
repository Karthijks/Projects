package a;

public class Employee {
	private int empNumber;
	private String empName;
	private Salary salary;

	Employee() {
		// TODO Auto-generated constructor stub
	}

	Employee(int empNumber, String empName, Salary salary) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.salary = salary;
	}

	Employee(Salary salary) {
		this.salary = salary;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", salary=" + salary + "]";
	}

}
