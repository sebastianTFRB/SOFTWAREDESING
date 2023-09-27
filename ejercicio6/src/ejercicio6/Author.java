package ejercicio6;

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


}

