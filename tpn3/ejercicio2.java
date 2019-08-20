package tpn3;

public class ejercicio2 {
	
	public static void main (String[]args) {
		
		int [][] matriz = new int [3][3];
		
		for (int x=0; x<matriz.length; x++) {
			for (int y=0; y<matriz.length; y++) {
				matriz [x][y]=(int)(Math.random()*100);
			}
		}
		
		
		for (int [] dimension:matriz) {
			for(int  elementos:dimension) {
				System.out.print(elementos+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
