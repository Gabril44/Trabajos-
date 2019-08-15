package tpn2;

import java.util.Scanner;

public class tpn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		
		int [] x = new int [10];
		int cont_neg=0;
		int cont_0=0;
		int cont_positivos=0;
		
		System.out.println("Debe ingresar 10 números");
		
		for(int i=0; i<x.length; i++) {
			
			System.out.println("ingrese número:");
			x[i]=sc.nextInt();
			
		}
		
		
		for(int j=0; j<x.length; j++) {
			
			if (x[j]<0) {
				cont_neg++;
			} else if(x[j]==0) {
				cont_0++;
			} else if (x[j]>0) {
				
				cont_positivos++;
			}
		}
		
		System.out.println("hay "+cont_neg+" números negativos ingresados");
		System.out.println("hay "+cont_0+" números igual a 0 ingresados");
		System.out.println("y "+cont_positivos+" números positivos ingresados");

	}

}
