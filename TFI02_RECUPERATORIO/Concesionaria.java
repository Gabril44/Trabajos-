package TFI02_RECUPERATORIO;

import java.util.Iterator;
import java.util.Set;

public class Concesionaria {
	
	
	private String nombre;
	private String direccion;
	Set <Vendedor> coleccionVendedores;
	Set <Autos> coleccionAutos;
	Set<Autos> autosVendidos;
	
	public Concesionaria(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void listarVendedores() {
		int cont=1;
	        System.out.println("Listado de vendedores :");
	        for (Vendedor vendedores : coleccionVendedores) {
	        	System.out.println("vendedor número: "+cont);
	        	System.out.println(vendedores.verNombre());
	        	cont++;
			}
			
	            
	        
	    }
		
		
	
	
	public void eliminarVendedor(String nombreDelVendedor) {
		
		
		Iterator<Vendedor> iterador = coleccionVendedores.iterator();
        while(iterador.hasNext()) {
            String buscado = iterador.next().verNombre();
            if(buscado.equals(nombreDelVendedor)) {
                iterador.remove();
                System.out.println("el vendedor " + nombreDelVendedor + " fue eliminado ");
            }
         }
	}
	
	
	public void listarAutos() {
		
		int cont=1;
        System.out.println("Listado de autos :");
        for (Autos autos : coleccionAutos) {
        	System.out.println("auto número: "+cont);
        	System.out.println(autos.toString());
        	cont++;
		}
		
		
	}
	
	
	
	
	
	public void vender (Vendedor vendedor, Autos auto) {
		
		vendedor.setCantidadDeVentas(vendedor.verCantidadDeVentas()+1);
		Iterator<Autos> iterador = coleccionAutos.iterator();
        while(iterador.hasNext()) {
            Autos buscado = iterador.next();
            if(buscado.equals(auto)) {
                iterador.remove();
		
            }
        }
        
        autosVendidos.add(auto);
        
	}
	
	public void incorporarVendedor(Vendedor vendedor) {
		
		coleccionVendedores.add(vendedor);
		
	}
	
	public void comprarAuto(Autos auto) {
		
		coleccionAutos.add(auto);
		
	}
	
	

	@Override
	public String toString() {
		return "Confesionaria [nombre=" + nombre + ", direccion=" + direccion + ", coleccionVendedores="
				+ coleccionVendedores + ", coleccionAutos=" + coleccionAutos + ", autosVendidos=" + autosVendidos + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Set<Vendedor> getColeccionVendedores() {
		return coleccionVendedores;
	}

	public void setColeccionVendedores(Set<Vendedor> coleccionVendedores) {
		this.coleccionVendedores = coleccionVendedores;
	}

	public Set<Autos> getColeccionAutos() {
		return coleccionAutos;
	}

	public void setColeccionAutos(Set<Autos> coleccionAutos) {
		this.coleccionAutos = coleccionAutos;
	}

	public Set<Autos> getAutosVendidos() {
		return autosVendidos;
	}

	public void setAutosVendidos(Set<Autos> autosVendidos) {
		this.autosVendidos = autosVendidos;
	}
	
	

}
