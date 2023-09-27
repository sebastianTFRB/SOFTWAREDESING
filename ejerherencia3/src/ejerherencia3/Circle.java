package ejerherencia3;

public class Circle extends Shape {
	private double radius;
	//Constructors
	public Circle(){
		this.radius=1.0;
	}
	public Circle(double radius){
		this.radius=radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
		
	}
	//get and set
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
	public double getPerimeter(){
		return 2*Math.PI*radius;
		
	}
	@Override
    public String toString() {
        return "cicle [color=" + getColor() + ", filled=" + getFilled() + "radius="+ radius +"]";
    }
	public void printCircle() {
        System.out.println("radius: " + radius);
        System.out.println("color: " + getColor());
        System.out.println("filled: " + getFilled());
        System.out.println("area: " + this.getArea());
        System.out.println("perimeter:  " + this.getPerimeter());
    }
	

}
