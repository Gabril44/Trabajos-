package TFI02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

class Carrera implements Informacion{
	
	String nombre;
	Set <Materias> materias;
	
	
	public Carrera(String nombre, Set<Materias> materias) {
		super();
		this.nombre = nombre;
		this.materias = materias;
	}
	
	public void agregarMateria(Materias materia) {
		
		this.materias.add(materia);
		
	}
	
	public void encontrarMateria(String nombre2) {
		
		Iterator <Materias> it = materias.iterator();
		if(it.next().getNombre().equals(nombre2)) {
			System.out.println("materia encontrada!");
		}
	}
	
public void eliminarMateria(String nombre2) {
		
		Iterator <Materias> it = materias.iterator();
		if(it.next().getNombre().equals(nombre2)) {
			it.remove();
		}
	}

 public String toString() {
 return "nombre: "+this.nombre;	
}

@Override
public int verCantidad() {
	
	return materias.size();
}

@Override
public String listarContenidos() {
	for (Materias materias2 : materias) {
		System.out.println(materias2.getNombre());
	}
	return null;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Set<Materias> getMaterias() {
	return materias;
}

public void setMaterias(Set<Materias> materias) {
	this.materias = materias;
}


	

}
