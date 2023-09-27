package programa1;

public class Date {
	
    private  int year;
    private int month;
    private int day;
		
		
		//constructor
		public Date(int year , int month, int day) {
			this.year = year;
			this.month = month;
			this.day =  day;
			
		}
		
		
			
		
		public int getYear() {

			return year;
			
		}
		
		public int getMonth() {
			
			return month;
			
		}
		public int getDay() {

			return day;
			
		
			
		}

		public void setYear(int year) {
			this.year = year;
			
		}

		public void setMonth(int month) {
			this.month = month;
			
		}

		public void setDay(int day) {
			this.day = day;
			
			
			
		}
		
		
		
		@Override
		public String toString() {
			return "fecha [" + month + "/" + day+ "/" + year + "]";
		}
		
		public void setDate(int year , int month, int day) {
			 if( year >= 1000 && year <= 9999) {
	           	 
	           	 this.year = year;
					
					
				 } else {
					
					 System.out.println(" año aseptado");
				 }
				
			 if( month >= 1 && month <= 12) {
	           	 
	           	 this.month = month;
					
				 } else {
					
					 System.out.println("mes no aseptado");
				 }
			 if( day >= 1 && day <= 30) {
	           	 
			        this.day = day;
							
							
				   } else {
							
					  System.out.println("dia no aseptado");
				   }
			
			
			
		}
	

	
}		
		
		