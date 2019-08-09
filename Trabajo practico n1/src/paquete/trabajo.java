package paquete;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class trabajo {
	public static void main (String []args) {
	
	//int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
	
	Scanner sc = new Scanner(System.in);
		
	
	
	
		
	int cont=1 ;
	
	do {
		System.out.println("ingrese edad");
		int edad=sc.nextInt();
		
		if (edad<18&&edad>0) {
			System.out.println("Es menor de edad.");
			cont=1;
		} else {
			if (edad==0) {
				System.out.println("Finalizado");
				cont--;
			} else {
				System.out.println("Es mayor de edad");
				cont=1;
			} 
		}
		
		
	}while(cont==1);

}}
