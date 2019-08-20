package tpn3;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz = new int [3][3];
		
		for (int x=0; x<matriz.length; x++) {
			for (int y=0; y<matriz.length; y++) {
				matriz [x][y] = (int) (Math.random()*100);
			}			
		}
		
		for(int [] dimensiones :matriz) {
			for (int elementos: dimensiones) {
				System.out.print(elementos+" ");
			}
			System.out.println(" ");
		}
		

	}

}
