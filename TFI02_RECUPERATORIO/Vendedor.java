package TFI02_RECUPERATORIO;

public class Vendedor implements ParaPersona{
	
	private String nombre;
	private int cantidadDeVentas;
	private int dni;
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidadDeVentas;
		result = prime * result + dni;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		if (cantidadDeVentas != other.cantidadDeVentas)
			return false;
		if (dni != other.dni)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

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
