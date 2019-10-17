package TFI01;

public class Empleados extends Personas {
	
	private double sueldo;
	
	public Empleados(String nombre, int edad) {
		
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Empleado nombre:"+getNombre()+" edad"+getEdad()+" sueldo"+this.sueldo;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Empleado";
	}

}
