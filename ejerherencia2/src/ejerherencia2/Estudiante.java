package ejerherencia2;

public class Estudiante extends Persona{
	//atributes
	private String program;
	private int year;
	private double fee;
	
	//constructor
	public Estudiante(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	//getters and setters

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	public void printStudent(){
		System.out.println("PROGRAM: "+program);
		System.out.println("YEAR: "+year);
		System.out.println("FEE: "+fee);
	}
	
	
	@Override
	public String toString() {
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	
	
	
}
