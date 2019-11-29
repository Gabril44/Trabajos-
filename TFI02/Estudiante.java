package TFI02;

public class Estudiante extends Persona{

	public Estudiante(String nombre, String apellido, String legajo) {
		super(nombre, apellido, legajo);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	@Override
	public void modificardatos() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("nombre del estudiante: "+this.nombre+" apellido: "+this.apellido+"y legajo: "+legajo);
	}





	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}







}
