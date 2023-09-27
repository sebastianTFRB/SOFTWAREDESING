package ejerherencia7;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.leerRadio(1.0);
        System.out.println("_______circulo_______");
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Circunferencia del círculo: " + circulo.circunferencia());
        System.out.println("Circunferencia del círculo: " + circulo.circunferencia());
        System.out.println("");
        Cilindro cilindro = new Cilindro();
        cilindro.leerRadio(4.0);
        cilindro.leerAltura(2,1);
        System.out.println("_______cilindro_______");
        System.out.println("area del cilindro: " + cilindro.areac());
        System.out.println("Volumen del cilindro: " + cilindro.volumen());
        System.out.println("");
        CilindroHueco cilindroHueco = new CilindroHueco();
        cilindroHueco.leerRadio(5.0);
        cilindroHueco.leerAltura(3,3);
        cilindroHueco.leerRadioInterior(3.0);
        System.out.println("_____cilindrohueco_____");
        System.out.println("Área superficial externa del cilindro hueco: " + cilindroHueco.areaSuperficialExterna());
        System.out.println("Área superficial interna del cilindro hueco: " + cilindroHueco.areaSuperficialInterna());
        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.volumen());
    }
}