package ejercicio2;

public class Employee {
	private  int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	
	//constructor
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	//getters
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	
	
	public String getName() { //methods
		return firstName+" "+lastName;
		
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() { //methods
		return salary*12;
	}
	public int raiseSalary(int percent) { //methods
		
		double increaseSalary = (percent /100.0)* salary; 
		
		salary +=increaseSalary;
		
		return salary;
}
	@Override
	public String toString() { //methods
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
	
	
	
	
}
