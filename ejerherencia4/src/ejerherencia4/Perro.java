package ejerherencia4;

public class Perro extends Mammal {
	public Perro(String name) {
        super(name);
    }
	public static void greets2() {
		System.out.println("Woof");
	}
	
    @Override
    public String toString() {
        return "Dog [" + super.toString() + "]";
    }

}
