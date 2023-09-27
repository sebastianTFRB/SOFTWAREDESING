package programa2;



public class Account {
	private String id;
	private String name;
	private int balance;

	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
		this.balance = 0;
	}
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int credit( int amount) { //methods
		
		balance += amount;
		
		return balance; 
	
	}
	
	public int debit(int amount) { //methods
		if(amount <= balance) {
			
			balance-=amount;
		
		} else {
			System.out.println("el monto exedio el saldo");
		}
		
		return balance;
	}
	
	public int transferTo(Account another, int amount) {//methods
		
		
		if(amount <= balance) {
			
			balance-= amount;
			another.credit(amount);
		} else {
			System.out.println(" el monto exedio el saldo");
			
		}
		
		
		return balance;
	}
	
      public void setInfo(String id, String name, int balance) {
    
	}
	
	
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
	
	
	