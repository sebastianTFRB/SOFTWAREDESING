package veiculos;

public class main {

    public static void main(String[] args) {
        // Create objects of the class Student
    	veculoCreador veculoCreador1 = new veculoCreador("frontier","toyota", 2018,"alejandro");
    	veculoCreador veculoCreador2 = new veculoCreador("linux","honda", 2023,"sebastian");
    	veculoCreador veculoCreador3 = new veculoCreador("supra","toyota", 2004,"diego");
    	veculoCreador veculoCreador4 = new veculoCreador("murcielago","lamborguini", 2012,"juan");
    
        // Accessing object methods and attributes
    	veculoCreador1.displayInfo();
    	veculoCreador2.displayInfo();
    	veculoCreador3.displayInfo();
    	veculoCreador4.displayInfo();
    }
}