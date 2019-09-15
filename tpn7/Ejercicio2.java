package tpn7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese un n�mero del 1 al 100:");
		//int nro=sc.nextInt();
		try {
            int numero=sc.nextInt();
            checkNumber(numero);
        }catch (InputMismatchException e) {
            System.out.println("No se ingresó un número");
        }
		

	}
	
	public static void checkNumber(int numero) throws MyException
    {
        if (numero < 0 || numero > 100)
        {
            throw new MyException("N�mero ingresado fuera del rango!");
        }else
            {
            System.out.println("N�mero ingresado dentro del rango.");
        }
    }

}
