package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Random azar = new Random();
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=0;i<100;i++){
            
            lista.add(azar.nextInt(20)+1);
        }
        int[] reaparece = new int[21];
        for(int n : lista){
            
            reaparece[n]++;
        }
        int numMayor=0;
        int numFrecuente=0;
        for(int i=1;i<=20;i++){

            System.out.println(i+" aparece "+reaparece[i]+" veces");
            if(reaparece[i]>numMayor){

                numMayor=reaparece[i];
                numFrecuente=i;
            }
        }
        System.out.println("Mas repetido: "+numFrecuente);
    }    
}
