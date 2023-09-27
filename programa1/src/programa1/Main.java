package programa1;


public class Main {
	public static void main (String[]args) {
		Date myDate = new Date (0, 0 , 0 );
		myDate.setDate(100000, -2, -25);
		
		System.out.println("dia: "+myDate.getDay());
		System.out.println("mes: "+myDate.getMonth());
		System.out.println("año: "+myDate.getYear());
		
		System.out.println(myDate);

		
	
		
	}
}
