package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio6 {
    
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random azar = new Random();

        int numEntero;
        int suma=0;
        do{

            numEntero = azar.nextInt(21)-10;
            lista.add(numEntero);
            suma+=numEntero;
        }while(numEntero!=10);
        double media = (double)suma/lista.size();
        System.out.println("Lista: "+lista);
        System.out.println("Suma: "+suma);
        System.out.println("Media: "+media);
    }
}
