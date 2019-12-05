package TFI02_RECUPERATORIO;

public class Vendedor implements ParaPersona{
	
	private String nombre;
	private int cantidadDeVentas;
	private int dni;
	

	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", cantidadDeVentas=" + cantidadDeVentas + ", dni=" + dni + "]";
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String verNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void cambiarNombre(String nombre) {
		this.nombre=nombre;
		
	}

	@Override
	public void modificarDni(int nroDNI) {
		this.dni=dni;
		
	}

	public int verCantidadDeVentas() {
		return cantidadDeVentas;
	}

	public void setCantidadDeVentas(int cantidadDeVentas) {
		this.cantidadDeVentas = cantidadDeVentas;
	}


	
	

}
