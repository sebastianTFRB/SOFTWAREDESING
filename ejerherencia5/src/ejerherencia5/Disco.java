package ejerherencia5;

public class Disco extends Publicacion {
    private float duracion;
    
    //CONSTRUCTOR
    public Disco(String titulo, float precio, float duracion) {
    	//SUPER ES UTILIZADO PARA LLAMAR EL CONSTRUCTOR BASE (PUBLICACION)
        super(titulo, precio);
        this.duracion = duracion;
    }
    
	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("Duración (minutos, segundos): " + duracion);
    }
}
