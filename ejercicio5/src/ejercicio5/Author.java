package ejercicio5;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        
        if (gender == 'm' || gender == 'f') { //methods
            this.gender = gender;
        }
        else {
        	this.gender = '?';
        }
        	
	}
            
        
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGrander() {
		return gender;
	}
	
	
	@Override
	public String toString() { //methods
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	
}