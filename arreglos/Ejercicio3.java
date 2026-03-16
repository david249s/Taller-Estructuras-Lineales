package arreglos;

import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Random azar = new Random();
        int capacidad = azar.nextInt(10)+1;

        int[] numEnteros = new int[capacidad];
        long[] factoriales = new long[capacidad];

        for(int i=0;i<capacidad;i++){

            numEnteros[i] = azar.nextInt(10)+1;
            factoriales[i] = numFactorial(numEnteros[i]);
        }
        System.out.print("Numeros Random: ");
        for(int j : numEnteros){
            
            System.out.print(j + " ");
        }
        System.out.print("\nFactoriales: ");
        for(long f : factoriales){
            
            System.out.print(f + ", ");
        }   
    }
    public static long numFactorial(int j){

        long f = 1;
        for(int i=1;i<=j;i++){
            
            f*=i;
        }
        return f;
    }
}
