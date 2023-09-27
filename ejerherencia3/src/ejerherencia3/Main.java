package ejerherencia3;




public class Main {
	public static void main(String[]args) {
		Shape Shape1=new Shape();
		System.out.println("Shape ");
		Shape1.printShape();
		System.out.println("____________");
		
		Circle circle1=new Circle(8.0,"blue",true);
		System.out.println("circle ");
		circle1.printCircle();
		System.out.println("____________");
		
		Rectangle rectangle1=new Rectangle(4.0,5.0,"dsadd",true);
		System.out.println("rectangle ");
		rectangle1.printRectangle();
		System.out.println("____________");
		
		Square square1=new Square();
		System.out.println("square ");
		square1.printSquare();
		System.out.println("____________");
		
		
		
		
	}
	
	
	
}


