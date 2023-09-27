package tickets_sale;
interface Shape {
	
	Shape clone();
	void impress();
}
class Boletos implements Shape {
	private int code;
	private String name;
	private String destination;
	private int client;
	
	public Boletos(int code , String name, String destination,int client) {
        this.code = code;
        this.name = name;
        this.destination = destination;
        this.client = client;
        
    }
    
   
    public void setCode(int code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setClient(int client) {
        this.client = client;
    }

    @Override
    public Shape clone() {
        return new Boletos(this.code, this.name, this.destination,this.client);
    }

    @Override
    public void impress() {
    	System.out.println("                     ");
    	System.out.println("___client number " + client+"___");
        System.out.println("print ticket code:" + code);
        System.out.println("print ticket code:" + name);
        System.out.println("print ticket code:" + destination);
    }

}
