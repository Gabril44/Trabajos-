package ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Operaciones
{
    public static void SumaN(ArrayList<Numeros> n) {
        double x = 0;
        Numeros num[] = n.toArray(new Numeros[n.size()]);
        Naturales natu;

        Iterator<Numeros> iterator = n.iterator();

        for (int i = 0; i < num.length; i++) {
            if (num[i].tipo.equals("Natural")) {
                natu = (Naturales)num[i];

                x+=natu.getValor();
            }
        }

        System.out.println ("La suma de todos los Naturales es: " +x);
    }

    public static void SumaC(ArrayList<Numeros> n) {
        double x = 0;
        double y = 0;
        Numeros num[] = n.toArray(new Numeros[n.size()]);
        Complejos complejo;

        for (int i = 0; i < num.length; i++) {
            if (num[i].tipo.equals("Complejo")){
                complejo = (Complejos) num[i];

                x+=complejo.getValor();
                y+=complejo.getValor2();
            }
        }

        System.out.println ("La suma de todos los Naturales es: " +x +" " +y +"i");
    }

    public static void ListadoN(ArrayList<Numeros> n, int cont) {
        Naturales natu[] = new Naturales[cont];
        Numeros num[] = n.toArray(new Numeros[n.size()]);
        double naturales[] = new double[cont];
        int j = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i].tipo.equals("Natural")){
                natu[j] = (Naturales)num[i];

                naturales[j]=natu[j].getValor();

                j++;
            }
        }

        Arrays.sort(naturales);

        for (int i = 0; i < naturales.length ; i++) {
            if (i==naturales.length) {
                return;
            }

            System.out.print (naturales[i] +", ");
        }
    }

    public static void ListadoC(ArrayList<Numeros> n, int cont) {
        Complejos comp[] = new Complejos[cont];
        Numeros num[] = n.toArray(new Numeros[n.size()]);
        double complejos[] = new double[cont];
        double complejos2[] = new double[cont];
        int j = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i].tipo.equals("Complejo")){
                comp[j] = (Complejos) num[i];

                complejos[j]=comp[j].getValor();
                complejos2[j]=comp[j].getValor2();

                j++;
            }
        }

        Arrays.sort(complejos);

        for (int i = 0; i < complejos.length ; i++) {
            if (i==complejos.length) {
                return;
            }

            System.out.print (complejos[i] +" " +complejos2[i] +", ");
        }
    }
    
} 
