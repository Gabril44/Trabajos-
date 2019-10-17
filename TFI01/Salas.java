package TFI01;

import java.util.Arrays;

public class Salas {
	
	private int capacidad;
	private String pelicula;
	private String nombre;
	private Espectadores[] espectadores;
	
	
	
	public Salas(int capacidad, String nombre) {
		super();
		this.capacidad = capacidad;
		this.nombre = nombre;
	}





	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}



	public String getEspectadores() {
		try {return "La cantidad de espectadores es: "+espectadores.length;
		
		}catch (Exception NullPointerException) {
			return "NO HAY ESPECTADORES CARGADOS";
		}
	}



	public void setEspectadores(Espectadores[] espectadores) {
		
		if(espectadores.length>capacidad) {
			System.out.println("SUPERA LA CAPACIDAD");
		} else {
		
		this.espectadores = espectadores;
		}
	}





	@Override
	public String toString() {
		return "Sala [capacidad=" + capacidad + ", pelicula=" + pelicula + ", nombre=" + nombre + ", espectadores="
				+ Arrays.toString(espectadores) + "]";
	}
	
	
	public void listarEspectadores() {
		try {
			for (int i=0; i<espectadores.length; i++) {
				System.out.println(espectadores[i].toString());
			}
		} catch (Exception NullPointerException) {
			System.out.println("NO HAY ESPECTADORES CARGADOS"); 
		}
	}
	
	

}
