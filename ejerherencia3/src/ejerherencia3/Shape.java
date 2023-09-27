package ejerherencia3;

public class Shape {
	//Attributes
	
		private String color;
		private boolean filled;
	//Constructors	
		public Shape(){
			this.color="red";
			this.filled=false;	
		}
		
		public Shape(String color, boolean filled) {
			this.color = color;
			this.filled=true;
		}
	//Get and Set	
		public String getColor() {
			return color;
		}
		public void setColor(String radius) {
			this.color = radius;
		}

		public boolean getFilled() {
			return filled;
		}

		public void setFilled(boolean filled) {
			this.filled = filled;
		}
		
		
		
		@Override
	    public String toString() {
	        return "Shape [color=" + color + ", filled=" + filled + "]";
	    }
		
		public void printShape() {
	        System.out.println("color: " + color);
	        System.out.println("filled: " + filled);
	    }
		
		
		
			

}
