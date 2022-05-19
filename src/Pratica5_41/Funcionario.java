package Pratica5_41;

public class Funcionario {

	String name;
	String iD;
	String department;
	double salary;
	boolean active;

	public Funcionario(String name, String iD, String department, double salary, boolean active) {
		super();
		this.name = name;
		this.iD = iD;
		this.department = department;
		this.salary = salary;
		this.active = active;
	}

	public Funcionario(String name, String iD) {
		super();
		this.name = name;
		this.iD = iD;
	}
	
	public Funcionario() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}	

	
	
	
}
