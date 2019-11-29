package TFI02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

class Facultad implements Informacion {
	
	
	
	private String nombre;
	Set<Carrera> carreras;
	
	

	public Facultad(String nombre, Set<Carrera> carreras) {
		super();
		this.nombre = nombre;
		this.carreras = carreras;
	}
	
	public void eliminarEstudiante(String nombre) {
		Iterator<Carrera> it = carreras.iterator ();
		while(it.hasNext()) {
			
			
			
		}
		
	}
	
	
	
	public void agregarCarrera(Carrera carrera) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nombre de la materia que desea agregar: ");
		String nombre = sc.next();
		
		this.carreras.add(carrera);
		
	}
	
	public void eliminarCarrera(String nombre) {
		Iterator<Carrera> it = carreras.iterator ();
		if(it.next().getNombre().equals(nombre)){
			
			it.remove();
			
			System.out.println("eliminado exitosamente");
			
		   }
	    }

	@Override
	public int verCantidad() {
		
		return carreras.size();
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Set<Carrera> getCarreras() {
		return carreras;
	}



	public void setCarreras(Set<Carrera> carreras) {
		this.carreras = carreras;
	}



	@Override
	public String listarContenidos() {
		for (Carrera carrera : carreras) {
			carrera.toString();
		}
		return null;
	}
	
	
	

}
