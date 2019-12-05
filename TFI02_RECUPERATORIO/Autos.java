package TFI02_RECUPERATORIO;

public class Autos {
	
	private int cantidadDePuertas;
	private String tipoDeVelocidades;
	private String marca;
	private int modelo;
	private double precio;
	private int kilometraje;
	
	
	
	
	public Autos(int cantidadDePuertas, String tipoDeVelocidades, String marca, int modelo, double precio,
			int kilometraje) {
		super();
		this.cantidadDePuertas = cantidadDePuertas;
		this.tipoDeVelocidades = tipoDeVelocidades;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.kilometraje = kilometraje;
	}
	
	
	




	public int getCantidadDePuertas() {
		return cantidadDePuertas;
	}







	public void setCantidadDePuertas(int cantidadDePuertas) {
		this.cantidadDePuertas = cantidadDePuertas;
	}







	public String getTipoDeVelocidades() {
		return tipoDeVelocidades;
	}







	public void setTipoDeVelocidades(String tipoDeVelocidades) {
		this.tipoDeVelocidades = tipoDeVelocidades;
	}







	public String getMarca() {
		return marca;
	}







	public void setMarca(String marca) {
		this.marca = marca;
	}







	public int getModelo() {
		return modelo;
	}







	public void setModelo(int modelo) {
		this.modelo = modelo;
	}







	public double getPrecio() {
		return precio;
	}







	public void setPrecio(double precio) {
		this.precio = precio;
	}







	public int getKilometraje() {
		return kilometraje;
	}







	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}







	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidadDePuertas;
		result = prime * result + kilometraje;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + modelo;
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipoDeVelocidades == null) ? 0 : tipoDeVelocidades.hashCode());
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
		Autos other = (Autos) obj;
		if (cantidadDePuertas != other.cantidadDePuertas)
			return false;
		if (kilometraje != other.kilometraje)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo != other.modelo)
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (tipoDeVelocidades == null) {
			if (other.tipoDeVelocidades != null)
				return false;
		} else if (!tipoDeVelocidades.equals(other.tipoDeVelocidades))
			return false;
		return true;
	}







	@Override
	public String toString() {
		return "Autos [cantidadDePuertas=" + cantidadDePuertas + ", tipoDeVelocidades=" + tipoDeVelocidades + ", marca="
				+ marca + ", modelo=" + modelo + ", precio=" + precio + ", kilometraje=" + kilometraje + "]";
	}







	public void mover(int cantKilometros) {
		
		this.kilometraje= kilometraje+cantKilometros;
		
	}

}
