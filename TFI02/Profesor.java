package TFI02;

class Profesor extends Persona {
	
	
	private double basico;
	private int antiguedad;
	
	

	public Profesor(String nombre, String apellido, String legajo) {
		super(nombre, apellido, legajo);
		
	}

	@Override
	public void modificardatos() {
		// TODO Auto-generated method stub
		
	}
	
	public double calcularSueldo() {
		//double resultado = 0;
		//for (int i = 0; i < antiguedad; i++) {
			
			double pors=((10*this.basico)/100);	
			double resultado = pors*this.antiguedad;
		//}
			
		return resultado; 
	
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("nombre: "+this.nombre+" apellido: "+this.apellido+"y legajo: "+legajo+"sueldo: "+this.calcularSueldo());
	}
	

}
