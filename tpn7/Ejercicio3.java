package tpn7;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int numero, control = 0;
        do {
            control = 0;
            System.out.println("Ingrese un nummero aleatorio ");
            try
            {
                numero = Integer.parseInt(sc.next());
                if (numero % 2 == 0)
                {
                    System.out.println("El nummero ingresado es par");
                } else
                    {
                    System.out.println("El numero ingresado es impar");
                }
            } catch (Exception e)
            {
                System.out.println("Oop! Eso no fue lo pedido! ");
                control = 1;
            }
        } while (control == 1);

	}

}
