package TFI01;

import java.util.Scanner;

public class Cine {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("------------bienvenido--------------");
		System.out.println("¿Cuántos Espectadores desea crear?");
		
		try {
		int num=sc.nextInt();
		
		Espectadores espectadores[] = new Espectadores[num];
		String nombre="";
		int edad=0;
		int silla=0;
		String fila ="";
		for (int i=0; i<num; i++) {
			System.out.println("espectador "+(i+1));
			System.out.println("nombre?");
			nombre = sc.next();
			System.out.println("edad? ");
			edad=sc.nextInt();
			System.out.println("silla? ");
			silla=sc.nextInt();
			System.out.println("fila? ");
			fila=sc.next();
			espectadores[i]=new Espectadores (nombre, edad, silla, fila);
			
			}
		//-------------------------------------------------------------------------
        
		Salas sala01 = new Salas(3, "Sala 01");
		sala01.setPelicula("Jocker");
		sala01.setEspectadores(espectadores);
		
		sala01.listarEspectadores();
		
		//-------------------------------------------------------------------------
		Acomodadores acomodador01 = new Acomodadores("Pedro", 25);
		acomodador01.setSueldo(50.000);
		
		System.out.println(acomodador01.toString());
		
		
		Empleados empleado01 = new Empleados("Juan", 33);
		System.out.println(empleado01.toString());
 } catch(Exception e) {
	 System.out.println("Error en el ingreso de datos");
 }
}
}
