package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Random azar = new Random();

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=0;i<20;i++){
            lista.add(azar.nextInt(100)+1);
        }

        System.out.println("Lista de numeros: "+lista);

        Collections.sort(lista);
        System.out.println("Ordenados de menor a mayor: "+lista);

        Collections.sort(lista,Collections.reverseOrder());
        System.out.println("Ordenados de mayor a menor: "+lista);

        ArrayList<Integer> numPares = new ArrayList<>();
        ArrayList<Integer> numImpares = new ArrayList<>();

        for(int n:lista){

            if(n%2==0)
                numPares.add(n);
            else
                numImpares.add(n);
        }

        System.out.println("Numeros pares: "+numPares);
        System.out.println("numeros impares: "+numImpares);
    }
}
