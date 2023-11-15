package ejerherencia4;

public class Gato extends Mammal{
	
	 public Gato(String name) { 
	      super(name);
	    }
	 public static void greets1() {
			System.out.println("Meow");
		}
		

	 @Override
	 public String toString() {
    return "Cat [" + super.toString() + "]";
    
    }
}