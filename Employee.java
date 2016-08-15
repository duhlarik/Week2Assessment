/*
 * Define a class that will be used to store information about an employee.
 * The employee class has three private variables, Name, SSN, and Salary.
 * The Name and SSN will be of type String, and the Salary is of type float.
 * Write setters and getters for all three variables, and write a constructor
 * that initializes those variables.
 */

public class Employee {
	
	private String name;
	private String ssn;
	private float salary;
	
	public Employee(String name, String ssn, float salary) {
		setName(name);
		setSsn(ssn);
		setSalary(salary);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
