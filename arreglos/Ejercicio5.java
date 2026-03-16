package arreglos;

import java.util.Random;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Random azar = new Random();

        int[] numEnteros = new int[20];
        int[] numInvertidos = new int[20];
        
        for(int i=0;i<20;i++){

            numEnteros[i] = azar.nextInt(200)-100;   
        }
        for (int i = 0; i < numEnteros.length; i++) {

            int num = numEnteros[i];
            int invertido = 0;
            int signo = 1;
            if (num < 0) {
                
                signo = -1;
                num = -num;
            }
            while (num > 0) {
                
                invertido = invertido * 10 + num % 10;
                num = num / 10;
            }
            numInvertidos[i] = invertido * signo;
        }
        System.out.print("Numeros Enteros: ");
        for (int n : numEnteros) {
            
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.print("Numeros Invertidos: ");
        for (int n : numInvertidos) {
            
            System.out.print(n + " ");
        }
    }
}
