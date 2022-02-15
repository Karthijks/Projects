package w;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("salaried")
public class SalariedEmployee extends Employee {

	private double annualSalary;

	public SalariedEmployee(int empno, String name, double annualSalary) {
		super(empno, name);
		this.annualSalary = annualSalary;
	}

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "annual_salary")
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

}
