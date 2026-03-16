package matrices;

import java.util.Random;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        Random azar = new Random();

        int n=3;
        int[][] matriz = new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matriz[i][j]=azar.nextInt(10);

        boolean matrizSimetrica=true;

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(matriz[i][j]!=matriz[j][i])
                    matrizSimetrica=false;

        System.out.println("Es simetrica: "+matrizSimetrica);

        System.out.println("Las esquinas son:");
        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][n-1]);
        System.out.println(matriz[n-1][0]);
        System.out.println(matriz[n-1][n-1]);
    }
}
