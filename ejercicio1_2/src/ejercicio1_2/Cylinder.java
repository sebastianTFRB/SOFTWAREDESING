package ejercicio1_2;

 public class Cylinder extends Circle{
	
	//atributos
	private double height;

	//constructores
	public Cylinder(double radius) {
		super(radius);
		this.height=1.0;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height=height;
	}
	
	public Cylinder(double radius, double height,String color) {
		super(radius, color);
		this.height=height;
	}
	//getters and setters

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
        return getArea() * height;
    }
	//metodos
	@Override
    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", color=" + getColor() + ", height=" + height + "]";
    }
	
	public void printCylinder() {
        System.out.println("Altura: " + height);
        System.out.println("Area: "+ this.getVolume());
    }
	
}

