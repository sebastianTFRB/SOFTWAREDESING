package tickets_sale;

public class Main {
	public static void main(String[] args) {
		Shape oneBolet = new Boletos(58, "sebastian" , "francia",1);
		
		Shape clonedBolet = oneBolet.clone();
		
		clonedBolet.impress();
		
		((Boletos) clonedBolet).setCode(78);
		((Boletos) clonedBolet).setName("dieguito");
		((Boletos) clonedBolet).setDestination("cuba");
	    ((Boletos) clonedBolet).setClient(2);
		clonedBolet.impress();
		
		((Boletos) clonedBolet).setCode(151515);
		((Boletos) clonedBolet).setName("luis");
		((Boletos) clonedBolet).setDestination("maracaibo");
		((Boletos) clonedBolet).setClient(2);
		clonedBolet.impress();
		
		((Boletos) clonedBolet).setCode(898959);
		((Boletos) clonedBolet).setName("juan");
		((Boletos) clonedBolet).setDestination("ipiales");
		((Boletos) clonedBolet).setClient(2);
		clonedBolet.impress();
		
	}

}
