package ejerherencia4;

public class Main {
	public static void main(String[]args) {
		Animal animal = new Animal("perro");
        Mammal mammal = new Mammal("gato");
        
        Gato gato1 = new Gato("venuz");
        Perro perro1 = new Perro("Firulais");

        
        
        System.out.println(animal.toString());
        System.out.println(mammal.toString());
        System.out.println(gato1);
        Gato.greets1();
        System.out.println(perro1);
        Perro.greets2();
	}
}