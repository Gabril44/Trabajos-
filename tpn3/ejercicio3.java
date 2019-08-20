package tpn3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int cont=0;
		int fila=0;
		int persona=0;
		String [][] matriz= new String [3][3];
		
		//relleno cada fila de la matriz con los datos de una persona
		//al completar una fila, se sigue con la columna siguiente.
		do {
			do {
				
				
				System.out.println("ingrese nombre: ");
				matriz[cont][fila]=sc.nextLine();
				fila++;
			}while(fila<1);
			
			
			do {
				
				System.out.println("ingrese dni: ");
				matriz[cont][fila]=sc.nextLine();
				fila++;
				// al sumarle uno a la fila, se pasa a la siguiente debido al do-while.
			}while(fila<2);
			
			
			do {
				
				System.out.println("ingrese edad: ");
				matriz[cont][fila]=sc.nextLine();
				fila++;
			}while(fila<3);
			
			//el contador se suma para que termine al rellenar 3 columnas.
			cont++;
			
			//la fila vuelve a 0 para que el proceso de rellenar se lleve a
			//cabo en la siguiente iteración.
			fila=0;
	
		}while(cont<3);
		// "cont<3" porque son 3 personas.
		
		
		
		for (int x=0; x<matriz.length; x++) {
			for(int y=0; y<matriz.length;y++) {
				System.out.println(matriz[x][y]);
				//imprimo la matriz.	
			    
			}
	     if(persona<2) {
			 System.out.println("-------------------------------------------------");
		     System.out.println("Siguiente persona");
		     System.out.println("-------------------------------------------------");
	         persona++;
	         
	         //aclaro que siguen los datos de la siguiente persona para
	         // que se pueda distinguir sin problemas la información.
	     }
			}  
		}
		
		
		
		
		
		}
		

	


