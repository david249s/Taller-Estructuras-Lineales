package arreglos;

import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Random azar = new Random();
        
        int[] numEntero = new int[25];

        for(int i=0;i<25;i++){
            numEntero[i] = azar.nextInt(100)-50;
        }

        int numMayor = numEntero[0];
        int numMenor = numEntero[0];

        for(int i : numEntero){

            if(i>numMayor) numMayor=i;
            if(i<numMenor) numMenor=i;
        }
        System.out.println("Numero Mayor: "+numMayor);
        System.out.println("Numero Menor: "+numMenor);
    }
}
