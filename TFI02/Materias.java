package TFI02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

 class Materias implements Informacion{
	
	
	
	String nombre;
	
	private Profesor titular;
	Set <Estudiante> estudiantes;
	

	public Materias(String nombre, Profesor titular, Set<Estudiante> estudiantes) {
		this.nombre = nombre;
		this.titular = titular;
		this.estudiantes = estudiantes;
		
		
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Materias other = (Materias) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public Profesor getTitular() {
		return titular;
	}


	public void setTitular(Profesor titular) {
		this.titular = titular;
	}


	public Set<Estudiante> getEstudiantes() {
		return estudiantes;
	}


	public void setEstudiantes(Set<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	@Override
	public int verCantidad() {
		
		for (Estudiante estudiante : estudiantes) {
			
			System.out.println(estudiantes.size());
			
			
		}
		
		return 0;
	}

	@Override
	public String listarContenidos() {
		
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.toString());
		}
		return "";
	}
	
	public void agregarEstudiante(Estudiante estudiante) {
		
		
		this.estudiantes.add(estudiante);
		
	}
	
	public String getNombre() {
		return this.nombre;
		
	}
	
	
	public void eliminarEstudiante(String nombre) {
		
		
		Iterator <Estudiante> it = estudiantes.iterator();
		if(it.next().getNombre().equals(nombre)){
			
			it.remove();
			
			System.out.println("eliminado exitosamente");
		}
		
	}


	@Override
	public String toString() {
		return "Materias [nombre=" + nombre + ", titular=" + titular + ", estudiantes=" + estudiantes + "]";
	}
	
	



}
