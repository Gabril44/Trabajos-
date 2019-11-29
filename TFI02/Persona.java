package TFI02;

abstract class Persona {
	
	//nombre, apellido, legajo.
	
	protected String nombre;
	protected String apellido;
	protected String legajo;
	
	
	public Persona(String nombre, String apellido, String legajo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
	}
	
	
	public abstract void modificardatos();


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((legajo == null) ? 0 : legajo.hashCode());
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
		Persona other = (Persona) obj;
		if (legajo == null) {
			if (other.legajo != null)
				return false;
		} else if (!legajo.equals(other.legajo))
			return false;
		return true;
	}
	
	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getLegajo() {
		return legajo;
	}


	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public abstract String getNombre();
	
	public abstract String toString();
	
	
	//modificardatos();

}
