package ejerherencia3;

public class Rectangle extends Shape{
	//Attributes
	
			private double width;
			private double lenght;
    //Constructors	
			public Rectangle(){
				this.width=1.0;
				this.lenght=3.0;	
			}
			public Rectangle(double lenght,double width) {
				this.width = width;
				this.lenght = lenght;
			}
			
			public Rectangle(double lenght,double width, String color, boolean filled) {
				super(color, filled);
				this.width = width;
				this.lenght = lenght;
			}
			public double getWidth() {
				return width;
			}
			public void setWidth(double width) {
				this.width = width;
			}

			public double getLength() {
				return lenght;
			}

			public void setLength(double lenght) {
				this.lenght = lenght;
			}
			public double getArearec(){
				return width*lenght;
			}
			public double getPerimeterrec(){
				return (width*2)+(lenght*2);
				
			}
			
			@Override
		    public String toString() {
		        return "rectangle [colr=" + getColor() + ", filled=" + getFilled() + "width="+ width + "lenght="+ lenght +"]";
		    }
			public void printRectangle() {
		        System.out.println("width: " + width);
		        System.out.println("length: "+ lenght);
		        System.out.println("color: " + getColor());
		        System.out.println("filled: " + getFilled());
		        System.out.println("Area: "+ this.getArearec());
		        System.out.println("perimetro: "+ this.getPerimeterrec());
		    }

}
