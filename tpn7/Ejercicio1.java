package tpn7;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese un n�mero");
		try{
			int nro=sc.nextInt();
		
		
		if(nro%2==0) {
			System.out.println("el numero "+nro+" es par");
		} else {
			System.out.println("el numero "+nro+" no es par");
		}
		
		} catch (Exception e) {
			System.out.println("El valor introducido no es num�rico. El programa se cerrar�");
		}
		

	}

}
