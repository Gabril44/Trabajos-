package tpn3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int matriz [][] = new int [3][3];
		
		//cargar matriz
		
		
		for (int x=0; x<matriz.length; x++) {
			for(int y=0; y<matriz.length; y++) {
				System.out.println("ingrese un número");
				matriz [x][y] = sc.nextInt();
				
			}
		}
		//imprimir ordenado
			
		for(int [] dimension: matriz) {
			for (int elementos: dimension) {
				System.out.print(elementos+" ");
			}
			System.out.println(" ");
			
			
		    }	
			
		//ordenar matriz
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				for(int x=0; x<matriz.length; x++) {
					for(int y=0; y<matriz.length; y++) {
						if (matriz [i][j] < matriz [x][y]) {
							int auxiliar = matriz [i][j];
							
							matriz [i][j] = matriz [x][y];
							
							matriz [x][y]= auxiliar;
							
						}
						
						
					}
				}
			}
		}
		
		
		//imprimir ordenado
		

		System.out.println("------------------------------------------------Matriz ordenada------------------------------------------------");
		
		for(int [] dimension: matriz) {
			for (int elementos: dimension) {
				System.out.print(elementos+" ");
			}
			System.out.println(" ");
			
			
		    }	
		
		
		

	}

}
