package clase3_for_each;

public class clase3_for_each {
	
	public static void main (String[]args) {
		
		int [][] matriz = new int [3][3];
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				
				matriz[i][j]=(int)(Math.random()*100);
				
			}
		} 
		
		for (int[] dimension1:matriz) {
			
			for(int elementos:dimension1) {
				System.out.print(elementos+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
