package clase3;

public class Clase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inicio la matriz.
		int [][] matriz = new int [3][3];
		
		//primera columna.
		
		matriz [0][0]=4 ;
		matriz [0][1]=5;
		matriz [0][2]=6;
		
		//segunda.
		
		matriz [1][0]=7;
		matriz [1][1]=8;
		matriz [1][2]=9;
		
		//tercera.
		
		matriz [2][0]=10;
		matriz [2][1]=11;
		matriz [2][2]=12;
		
		//imprimir por pantalla.
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				
				System.out.print(matriz [i][j]+" " );
				
			}
			System.out.println(" ");
		}
		
		

	}

}
