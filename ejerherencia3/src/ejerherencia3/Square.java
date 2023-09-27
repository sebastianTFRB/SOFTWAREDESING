package ejerherencia3;

public class Square  extends Shape  {
	//Attributes
	private double side;
	private double width;
	private double lenght;
	//Constructors	
	public Square(){
		this.side=2.0;
		this.width=side;
		this.lenght=side;
		
	}
	public Square (double side){
		this.side = side;
	}
	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;

	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}


	public void setWidth(double side) {
		this.width = side;
	}
	public void setLenght(double side) {
		this.lenght = side;
	}
	@Override
    public String toString() {
        return "Square [side" + side + "width="+ width + "lenght="+ lenght +"]";
    }
	public void printSquare() {
		System.out.println("color: " + getColor());
        System.out.println("filled: " + getFilled());
        System.out.println("width: " + width);
        System.out.println("sice "+ side);
        System.out.println("length: "+ lenght) ;
       
    }

}
