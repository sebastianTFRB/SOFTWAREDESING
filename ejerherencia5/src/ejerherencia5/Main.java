package ejerherencia5;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("la sangre manda", 150000, 350, 2004);
        
        Disco disco = new Disco("escorlax", 456653.2f , 59.58f);
        
        System.out.println("Información del Libro:");
        libro.mostrar();
        System.out.println("");
        System.out.println("Información del Disco:");
        disco.mostrar();
    }
}
