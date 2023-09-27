package programa2;



	public class Main {
		public static void main (String[]args) {
		
			
			Account acount1 = new Account ("0", "0", 0 ); 
			acount1.setInfo(" 01","cuenta1", 1000);
			Account acount2 = new Account ("0", "0", 0 ); 
			acount2.setInfo(" 02","cuenta2", -2000);
			
			System.out.println("____credit sistem_____");
			System.out.println("credito cuenta 1: "+ acount1.credit(-800));
			System.out.println("credito cuenta 2: "+ acount2.credit(800));
			
			System.out.println("____devit sistem_____");
			System.out.println("debito cuenta 1: "+ acount1.debit(700));
			System.out.println("debito cuenta 1: "+ acount2.debit(700));
			System.out.println("____transfert sistem_____");
	        acount1.transferTo(acount2, 300);

	        
	        System.out.println(acount1);
	        System.out.println(acount2);
			
		}
		

}
