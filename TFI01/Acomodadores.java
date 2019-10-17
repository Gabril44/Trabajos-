package TFI01;

public class Acomodadores extends Empleados implements ParaAcomodadores{

	
	private Salas sala;
	
	
	
	public Acomodadores(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Salas getSala() {
		
		return this.sala;
	}

	@Override
	public void setSala(Salas sala) {
		this.sala=sala;
		
	}
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Acomodador";
	}
	
	public String toString() {
		return "Acomodador nombre: "+this.getNombre()+" edad:"+this.getEdad();
	}
	

}
