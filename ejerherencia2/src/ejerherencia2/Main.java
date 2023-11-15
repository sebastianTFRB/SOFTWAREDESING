package ejerherencia2;

public class Main {
	public static void main(String[]args) {
		//name, address, program, year, fee
		Estudiante studentOne=new Estudiante("Sebastian", "parque bolivar", "industrial",2004,9000000);
		
		System.out.println("Firs Student Information: ");
		studentOne.printPerson();
		studentOne.printStudent();
		
		System.out.println("----------------------");
		
		//String name, String address, String school, double pay
		Personal staffOne=new Personal("Diego","fatima", "javeriana",8856524);
		System.out.println("Firs Staff Information: ");
		staffOne.printPerson();
		staffOne.printStaff();
		
	
	
	}
}