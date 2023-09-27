package ejercicio2;

public class Main{
	public static void main(String[]args) {
		//int id, String firstName, String lastName, int salary
		Employee employeeone=new Employee(820,"Diego","España",3000000);
		
		System.out.println("informacion primer empleado: ");
		System.out.println("nombre y apellido: "+employeeone.getName());
		System.out.println("ID: "+employeeone.getId());
		System.out.println("Salario: "+employeeone.getSalary());
		System.out.println("Salario Anual: "+employeeone.getAnnualSalary());
		//double newSalary = employeeone.raiseSalary(30);
        //System.out.println("Nuevo salario: " + newSalary);
		System.out.println("Nuevo salario: " +employeeone.raiseSalary(30));
	}
}