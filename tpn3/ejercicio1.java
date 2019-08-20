package tpn3;

public class ejercicio1 {
	
	public static void main (String[]args) {
		
		int [] array = new int [100];
		
		for (int i=0; i<array.length; i++) {
			array [i]=(int)(Math.random()*100);	
			}
			
		for (int elementos:array) {
			System.out.print(elementos+" ");
		}
		
		}
		
		
	}


