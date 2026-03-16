package matrices;

import java.util.Random;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Random azar = new Random();

        int n=4;
        int[][] matriz = new int[n][n];
        int suma=0;

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                matriz[i][j]=azar.nextInt(101)-50;
                if(i+j==n-1)
                    suma+=matriz[i][j];
            }
        }
        System.out.println("Suma diagonal secundaria: "+suma);
    }
}
