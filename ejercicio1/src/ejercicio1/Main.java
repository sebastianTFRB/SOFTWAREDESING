package ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Circle circle1=new Circle();
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("Circulo 1:");
		System.out.println("ingrese el radio");
		circle1.setRadius(teclado.nextDouble());
		circle1.printCircle();
		System.out.println("-----------------------------");
		System.out.println(circle1);
	}
	
	
	
	
}