package ejerherencia4;

public class Mammal extends Animal{

	public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
    	//return "Animal [name=" + name + "]";

        return "Mammal [Animal [name=" + super.toString() +"]";
    }
}