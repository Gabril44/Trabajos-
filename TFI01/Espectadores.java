package TFI01;

public class Espectadores extends Personas{
	
	
	private int silla;
	private String fila;
	
	
	
	

	public Espectadores(String nombre, int edad, int silla, String fila) {
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.silla = silla;
		this.fila = fila;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+this.getNombre()+ " Edad: "+getEdad()+ " silla:"+this.silla+" Fila: "+ this.fila;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Espectador";
	}
	
	public String getButaca() {
		return "fila: "+this.fila+"  silla: "+this.silla;
	}
	
	
	

}
