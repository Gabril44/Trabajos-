package tpn2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int [] g= new int [10];
		int cont=0;
		int acum=0;
		
		System.out.println("ingrese 10 numeros");
		
		for(int i=0; i<g.length;i++) {
			System.out.println("ingrese número: ");
			g[i]=sc.nextInt();
			
		}
		
		for (int j=0; j<g.length; j++) {
			
			if (j%2==0) {
				cont++;
				
				acum=acum+g[j];
			}
			
		}
		
		
		
		System.out.println("el resultado de la media de las posiciones pares es: "+acum/cont);
		

	}

}
