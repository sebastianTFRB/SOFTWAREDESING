package veiculos;

public class veculoCreador {
    // Attributes
	private String buyer;
    private String brand;
    private int year;
    private String model;
    
    // Constructor
    public veculoCreador(String brand, String model, int year, String buyer) {
    	this.buyer = buyer;
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    // Methods
    public String getMbuyer() {
        return buyer;
    }

    public String getbrand() {
        return brand;
    }

    public int getyear() {
        return year;
    }

    public String getmodel() {
        return model;
    }
    
    public void displayInfo() {
    	System.out.println("_______"+buyer+"________");
        System.out.println("brand: " + brand);
        System.out.println("year: " + year);
        System.out.println("model: " + model);
        System.out.println("");
    }
}

